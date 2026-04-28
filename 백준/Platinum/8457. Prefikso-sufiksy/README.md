# [Platinum II] Prefikso-sufiksy - 8457

[문제 링크](https://www.acmicpc.net/problem/8457)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

자료 구조, 문자열, 세그먼트 트리, 스택, 접미사 배열과 LCP 배열

### 문제 설명

<p>Prefikso-sufiksem danego słowa <em>w</em>&nbsp;nazywamy słowo <em>v</em>, kt&oacute;re jest zar&oacute;wno prefiksem (początkowym fragmentem), jak i sufiksem (końcowym fragmentem) <em>w</em>. Prefikso-sufiksem właściwym&nbsp;<em>w</em>&nbsp;jest każdy jego prefikso-sufiks, kt&oacute;ry jest niepusty i kr&oacute;tszy od&nbsp;<em>w</em>. Niech PS(<em>w</em>)&nbsp;oznacza liczbę właściwych prefikso-sufiks&oacute;w słowa <em>w</em>. Przez <em>w</em>[<em>i</em>, <em>j</em>]&nbsp;oznaczamy podsłowo słowa&nbsp;<em>w</em>&nbsp;zaczynające się na pozycji <em>i</em>&nbsp;i kończące się na pozycji <em>j</em>. Pozycje numerujemy od 1.</p>

<p>Dane jest słowo <em>w</em>. Twoim zadaniem jest wyznaczenie łącznej liczby właściwych prefikso-sufiks&oacute;w wszystkich podsł&oacute;w&nbsp;<em>w</em>, czyli obliczenie wyrażenia</p>

<p>\[\sum_{1 \le i \le j&nbsp;\le \left|w\right|}{PS\left(w\left[i, j\right]\right)}\text{.}\]</p>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajduje się słowo <em>w</em>, składające się z co najmniej 1&nbsp;i co najwyżej 10<sup>5</sup>&nbsp;znak&oacute;w. W słowie występują jedynie małe litery alfabetu angielskiego.</p>

### 출력

<p>Na wyjściu należy wypisać sumaryczną liczbę właściwych prefikso-sufiks&oacute;w wszystkich podsł&oacute;w <em>w</em>.</p>