#include <math.h>

#include <iostream>
using namespace std;

void printTower(int *arr, int *arr2, int *arr3, int count) {
    // int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    // int arr2[] = {0,0,0,0,0,0,0,0,0,0};
    // int arr3[] = {0,0,0,0,0,0,0,0,0,0};
    system("CLS");
    int pieces = count;
    int firstEnd = pieces * 2 + 1;
    int hight = pieces + 1;

    if (firstEnd % 2 == 0) {
        firstEnd++;
    }
    int secondEnd = firstEnd * 2;
    int thirdEnd = firstEnd * 3;

    int mid = firstEnd / 2;
    int mid2 = secondEnd - (firstEnd / 2);
    int mid3 = thirdEnd - (firstEnd / 2);

    for (int i = hight; i >= 0; i--) {
        int wide = 0;
        if (i < hight) wide = arr[i - 1] * 2 + 1;
        wide = wide > 1 ? wide : 0;
        bool midLine = wide > 1 ? false : true;
        int subLeft = (firstEnd - wide) / 2;
        int subRight = subLeft;

        int wide2 = 0;
        if (i < hight) wide2 = arr2[i - 1] * 2 + 1;
        wide2 = wide2 > 1 ? wide2 : 0;
        bool midLine2 = wide2 > 1 ? false : true;
        int subLeft2 = (firstEnd - wide2) / 2;
        int subRight2 = subLeft2;

        int wide3 = 0;
        if (i < hight) wide3 = arr3[i - 1] * 2 + 1;
        wide3 = wide3 > 1 ? wide3 : 0;
        bool midLine3 = wide3 > 1 ? false : true;
        int subLeft3 = (firstEnd - wide3) / 2;
        int subRight3 = subLeft3;

        for (int j = 0; j <= thirdEnd; j++) {
            if (j == firstEnd || j == secondEnd + 1) {
                cout << " ";
            }

            // first tower
            if (j <= firstEnd) {
                if (subLeft > 0 && i != 0 && j != mid) {
                    cout << " ";
                    subLeft--;
                }
                if (subLeft == 0 && wide > 0 && i != hight && i != 0) {
                    cout << "#";
                    wide--;
                }
                if (subRight > 0 && subLeft <= 0 && wide <= 0 && j > mid && i != 0) {
                    cout << " ";
                    subRight--;
                }
                if (midLine == true) {
                    if (j == mid && i != 0) {
                        cout << "|";
                    }
                }
                if (i == 0 && j <= firstEnd - 1) {
                    cout << "=";
                }
            }

            // second tower
            if (j > firstEnd && j <= secondEnd) {
                if (subLeft2 > 0 && i != 0 && j != mid2) {
                    cout << " ";
                    subLeft2--;
                }
                if (subLeft2 == 0 && wide2 > 0 && i != hight && i != 0) {
                    cout << "#";
                    wide2--;
                }
                if (subRight2 > 0 && subLeft2 <= 0 && wide2 <= 0 && j > mid2 && i != 0) {
                    cout << " ";
                    subRight2--;
                }
                if (midLine2 == true) {
                    if (j == mid2 && i != 0) {
                        cout << "|";
                    }
                }
                if (i == 0 && j <= secondEnd) {
                    cout << "=";
                }
            }

            // third tower
            if (j > secondEnd) {
                if (subLeft3 > 0 && i != 0 && j != mid3) {
                    cout << " ";
                    subLeft3--;
                }
                if (subLeft3 == 0 && wide3 > 0 && i != hight && i != 0) {
                    cout << "#";
                    wide3--;
                }
                if (subRight3 > 0 && subLeft3 <= 0 && wide3 <= 0 && j > mid3 && i != 0) {
                    cout << " ";
                    subRight3--;
                }
                if (midLine3 == true) {
                    if (j == mid3 && i != 0) {
                        cout << "|";
                    }
                }
                if (i == 0) {
                    cout << "=";
                }
            }
        }
        cout << endl;
    }
    cout << endl;
}

// first second third
// i%3 == 1 => first  third
// i%3 == 2 => first  second
// i%3 == 0 => third  second
void tswitch(int *arr1, int *arr2, int count) {
    int i = count - 1;
    int j = count - 1;
    //cout << "i: " << i << " j: " << j << endl;

    while (arr1[i] <= 0) {
        i--;
        if (i < 0) {
            i = 0;
            break;
        }
    }
    while (arr2[j] <= 0) {
        j--;
        if (j < 0) {
            j = 0;
            break;
        }
    }
    // cout << "i: " << i << " arr1[i]: " << arr1[i] << "      j: " << j << " arr2[j]: " << arr2[j] << endl;
    if (arr1[i] == 0 || arr2[j] == 0) {
        if (arr1[i] > arr2[j]) {
            arr2[j] = arr1[i];
            arr1[i] = 0;
        } else {
            arr1[i] = arr2[j];
            arr2[j] = 0;
        }
    } else {
        if (arr1[i] > arr2[j]) {
            arr1[i + 1] = arr2[j];
            arr2[j] = 0;
        } else {
            arr2[j + 1] = arr1[i];
            arr1[i] = 0;
        }
    }
    // cout << arr1[0] << arr1[1] << arr1[2] << endl;
}

void toh(int *from, int *inter, int *to, int count) {
    int totalNumOfMoves = pow(2, count) - 1;
    if (count % 2 == 0) {
        int *temp = inter;
        inter = to;
        to = temp;
    }
    for (int i = 1; i <= totalNumOfMoves; i++) {
        if (i % 3 == 1) {
            // cout << "1" << endl;
            tswitch(from, to, count);
        } else if (i % 3 == 2) {
            //  cout << "2" << endl;
            tswitch(from, inter, count);
        } else if (i % 3 == 0) {
            //  cout << "0" << endl;
            tswitch(inter, to, count);
        }
        if (count % 2 == 0) {
            printTower(from, to, inter, count);
        } else {
            printTower(from, inter, to, count);
        }
        cout << "Step: " << i << endl;
    }
}

int *createArray(int count, bool fillWithNumbers) {
    int *arr = new int[count];
    for (int i = 0; i < count; i++) {
        if (fillWithNumbers == true) {
            arr[i] = count - i;
        } else {
            arr[i] = 0;
        }
    }4
    return arr;
}

int main() {
    int pieces = 10;
    int enter = 0;

    cout << "How many discs: ";
    cin >> enter;
    if(enter <= 0) {
        cout << "False input! Discs set to 3!" << endl;
        pieces = 3;
    } else {
        pieces = enter;
    }

    int *arr = createArray(pieces, true);
    int *arr2 = createArray(pieces, false);
    int *arr3 = createArray(pieces, false);
    toh(arr, arr2, arr3, pieces);
    // printTower(arr, arr2, arr3, pieces);
    cout << "Press enter to exit!";
    fflush(stdin);
    enter = getchar();

    return 0;
}
