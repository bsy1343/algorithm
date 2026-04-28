# [Platinum II] Liczby względnie pierwsze - 26792

[문제 링크](https://www.acmicpc.net/problem/26792)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 8, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

수학, 정수론, 이분 탐색, 포함 배제의 원리

### 문제 설명

<p>Bajtazar zafascynował się ostatnio zagadnieniem liczb względnie pierwszych. Przypomnijmy, że liczba naturalna x jest względnie pierwsza z liczbą naturalną y, jeśli największy wsp&oacute;lny dzielnik liczb x i y jest r&oacute;wny 1. Na przykład liczbami względnie pierwszymi z 10 są</p>

<p style="text-align: center;">1, 3, 7, 9, 11, 13, 17 . . .</p>

<p>Bajtazar wypisał wszystkie liczby względnie pierwsze z liczbą n w kolejności rosnącej. Taką listę oprawił sobie w ramkę i od dziś nazywa ją listą Bajtazara.</p>

<p>Zanim swoje dzieło powiesi na ścianie, dla pewności jednak wypadałoby sprawdzić poprawność listy. Ponieważ lista ta jest nieskończona, Bajtazar chciałby tylko wyrywkowo sprawdzić jej poprawność na pewnym fragmencie długości c, zaczynając od pozycji k-tej. Elementy listy numerujemy kolejnymi liczbami, począwszy od 1. Czy pomożesz mu w tym zadaniu?</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby naturalne n, k oraz c (2 &le; n &le; 10<sup>14</sup>, 1 &le; k &le; 10<sup>14</sup>, 1 &le; c &le; 100 000) określające kolejno: liczbę wybraną przez Bajtazara, pozycję początkową sprawdzanego fragmentu oraz długość sprawdzanego fragmentu listy Bajtazara.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście c liczb naturalnych pooddzielanych pojedynczymi odstępami &ndash; kolejne elementy na pozycjach k, (k + 1), (k + 2), . . ., (k + c &minus; 1) na liście Bajtazara, kt&oacute;ra &ndash; przypomnijmy &ndash; zawiera liczby względnie pierwsze z n, wypisane w kolejności rosnącej.</p>

### 힌트

<p>Wyjaśnienie do przykładu: Bajtazar pyta o elementy na pozycjach 3, 4, 5 oraz 6 na swojej liście. Lista Bajtazara w tym przypadku (dla n = 10) składa się kolejno z liczb 1, 3, 7, 9, 11, 13, 17 . . .</p>