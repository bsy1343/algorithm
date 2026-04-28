# [Silver III] Kodowanie - 8857

[문제 링크](https://www.acmicpc.net/problem/8857)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 49, 맞힌 사람: 44, 정답 비율: 91.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Pawła, studenta informatyki na Uniwersytecie Wrocławskim, w ostatnim semestrze bardzo zaciekawiły problemy poruszane na przedmiocie Kompresja danych. Jako zdolny uczeń, Paweł postanowił wymyślić nowy spos&oacute;b na kompresję sekwencji liczb naturalnych.</p>

<p>Pierwszym krokiem algorytmu Pawła jest zamiana ciąg&oacute;w liczb naturalnych na ciągi liczb zapisanych binarnie. Nie można zrobić tego tak po prostu - trzeba umieć oddzielać kolejne kodowane liczby używając tylko zer i jedynek. W tym celu, Paweł postanowił wykorzystać dwie sąsiednie jedynki jako znacznik końca pojedynczej liczby. Ta metoda pociąga za sobą jednak pewne konsekwencje. Aby m&oacute;c rozdzielać kolejne elementy ciągu, binarny kod żadnej z liczb nie może zawierać dw&oacute;ch sąsiednich jedynek, a także musi zaczynać się od jedynki.</p>

<p>Chcąc zbadać skuteczność kompresji, Paweł potrzebuje wiedzieć ile r&oacute;żnych liczb jest w stanie zakodować używając&nbsp;<strong>n</strong>&nbsp;bit&oacute;w. Niestety, Paweł w obecnym semestrze ma sporo pracy - poprosił więc Ciebie o pomoc. Twoim zadaniem jest napisanie programu, kt&oacute;ry dla podanej wartości&nbsp;<strong>n</strong>&nbsp;obliczy ile jest r&oacute;żnych, binarnych kod&oacute;w długości&nbsp;<strong>n</strong>, kt&oacute;re zaczynają się od jedynki i nie zawierają dw&oacute;ch jedynek koło siebie.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się jedna liczba całkowita&nbsp;<strong>T</strong>&nbsp;(1&lt;=<strong>T</strong>&lt;=100), oznaczająca ilość zestaw&oacute;w danych. Następnie na wejściu podane są opisy kolejnych zestaw&oacute;w danych. Pojedynczy zestaw danych składa się z jednej linii. Znajduje się w niej jedna liczba całkowita&nbsp;<strong>n</strong>&nbsp;(1&lt;=<strong>n</strong>&lt;=45).<strong>&nbsp;</strong></p>

### 출력

<p>Dla każdego zestawu danych Tw&oacute;j program powinien wypisać pojedynczą linię zawierającą jedną liczbę całkowitą. Jest to liczba r&oacute;żnych ciąg&oacute;w zero-jedynkowych długości&nbsp;<strong>n</strong>, kt&oacute;re zaczynają się od jedynki i nie zawierają dw&oacute;ch sąsiednich jedynek.</p>

### 힌트

<p>Wszystkie ciągi długości 4, kt&oacute;re spełniają podane kryteria to 1000, 1001, 1010.</p>