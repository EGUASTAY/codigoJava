    public static void seleccion(float A[], String[] nom) {
        int i, j, pos;
        float menor, tmp;
        String menornom, tmpnom;
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
            menor = A[i]; // de los elementos que quedan por ordenar
            menornom = nom[i];
            pos = i; // y guardamos su posición
            for (j = i + 1; j < A.length; j++) { // buscamos en el resto
                if (A[j] < menor) { // del array algún elemento
                    menor = A[j]; // menor que el actual
                    menornom = nom[j];
                    pos = j;
                }
            }
            if (pos != i) { // si hay alguno menor se intercambia
                tmp = A[i];
                tmpnom = nom[i];
                A[i] = A[pos];
                nom[i] = nom[pos];
                A[pos] = tmp;
                nom[pos] = tmpnom;
            }
        }
        for (i = 1; i < A.length; i++) {
            System.out.println(nom[i] + "----" + A[i] + "\n");
        }
    }
