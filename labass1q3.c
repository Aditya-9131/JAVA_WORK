#include <stdio.h>

int main() {
    int n;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    printf("\n");

    int i, j, x, y = 0;

    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            printf(" * ");
        }
        printf("\n");
    }

    printf("Enter the argument between 0 and %d: ", n - 1);
    scanf("%d", &x);

    while (y < n) {
        y++;
        if (y >= n) {
            break;
        }
        y--;

        for (j = 0; j < n; j++) {
            printf(" * ");
        }
        y++;
        printf("\n");

        for (j = y; j < x + y; j++) {
            y++;
            if (y >= n) {
                break;
            }
            y--;

            for (int k = 0; k < n - 1; k++) {
                printf("   ");
            }
            printf(" * \n");
        }
        y += x;
        if (y >= n) {
            break;
        }

        for (int h = 0; h < n; h++) {
            printf(" * ");
        }
        y++;
        if (y >= n) {
            break;
        }
        printf("\n");

        for (int t = y; t < x + y; t++) {
            y++;
            if (y >= n) {
                break;
            }
            y--;

            printf(" * \n");
        }
        y += x;
        if (y >= n) {
            break;
        }
    }

    return 0;
}

