# [Gold IV] Antypalindrom - 26748

[문제 링크](https://www.acmicpc.net/problem/26748)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 16, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

애드 혹

### 문제 설명

<p>Palindrom to słowo, kt&oacute;re czytane od przodu i od tyłu jest takie samo (na przykład kajak lub <code>anna</code>). Na potrzeby tego zadania przyjmujemy, że palindrom musi mieć co najmniej 2 znaki. Z kolei antypalindrom to słowo, kt&oacute;re nie zawiera jako sp&oacute;jny fragment żadnego palindromu. Na przykład słowa <code>bajtek</code> lub <code>bajtocja</code> są antypalindromami, zaś <code>kajak</code> ani <code>olimpiada</code> nie są.</p>

<p>Bajtynka nie lubi palindrom&oacute;w. Właśnie napisała na kartce słowo, kt&oacute;re ma być jej pseudonimem w grze internetowej, ale podejrzewa, że w słowie tym są palindromy &ndash; co bardzo zepsułoby jej humor. Bajtynka postanowiła więc odciąć z przodu i z końca słowa pewien (być może pusty) fragment, aby pozostała (koniecznie niepusta) część była antypalindromem. Decyzji tej można dokonać na wiele sposob&oacute;w. Ile dokładnie?</p>

<p>Napisz program, kt&oacute;ry wyznaczy liczbę sposob&oacute;w wycięcia początkowego i końcowego fragmentu słowa aby uzyskać niepusty antypalindrom.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się niepusty ciąg małych liter alfabetu angielskiego &ndash; słowo Bajtynki. Długość ciągu nie przekracza 100 000 znak&oacute;w.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinna się znaleźć jedna nieujemna liczba całkowita &ndash; liczba r&oacute;żnych sposob&oacute;w na jakie można wyciąć antypalindrom ze słowa z wejścia zgodnie z powyższymi warunkami. Dwa sposoby uznajemy za r&oacute;żne, jeśli ucinają r&oacute;żną liczbę znak&oacute;w z przodu lub r&oacute;żną liczbę znak&oacute;w z tyłu słowa.</p>