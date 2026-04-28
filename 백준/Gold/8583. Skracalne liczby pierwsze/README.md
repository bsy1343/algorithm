# [Gold III] Skracalne liczby pierwsze - 8583

[문제 링크](https://www.acmicpc.net/problem/8583)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 27, 맞힌 사람: 22, 정답 비율: 75.862%

### 분류

수학, 정수론, 백트래킹, 소수 판정, 런타임 전의 전처리

### 문제 설명

<p>Przypomnijmy, że&nbsp;<i>liczba pierwsza</i>&nbsp;to taka dodatnia liczba całkowita, kt&oacute;ra ma dokładnie dwa r&oacute;żne dzielniki: jedynkę i samą siebie. M&oacute;wimy, że liczba $a$&nbsp;jest&nbsp;<i>prefiksem</i>&nbsp;liczby $b$, jeśli liczba $a$&nbsp;powstaje przez usunięcie pewnej liczby cyfr z końca liczby $b$. Na przykład, liczba $1231$&nbsp;jest prefiksem liczby $12314433$.&nbsp;<i>Skracalna liczba pierwsza</i>&nbsp;to taka liczba, kt&oacute;rej wszystkie prefiksy niezerowej długości są liczbami pierwszymi. Przykładowo, liczba $23$&nbsp;jest skracalną liczbą pierwszą, gdyż jej niepuste prefiksy $2$&nbsp;i $23$&nbsp;są liczbami pierwszymi.</p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry dla zadanych dw&oacute;ch liczb całkowitych dodatnich $a$, $b$&nbsp;($a &le; b$) wyznaczy, ile jest liczb całkowitych, kt&oacute;re są skracalnymi liczbami pierwszymi i należą do domkniętego przedziału $[a,b]$.</p>

### 입력

<p>W jedynym wierszu standardowego wejścia znajdują się dwie liczby całkowite $a$, $b$&nbsp;($1 &le; a &le; b &le; 10^{18}$).</p>

### 출력

<p>W jedynym wierszu standardowego wyjścia powinna znaleźć się jedna liczba całkowita będąca liczbą skracalnych liczb pierwszych nie mniejszych od $a$&nbsp;i nie większych od $b$.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;W przedziale $[20,24]$&nbsp;jest tylko jedna skracalna liczba pierwsza i jest nią $23$.</p>