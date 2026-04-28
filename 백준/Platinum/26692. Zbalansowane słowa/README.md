# [Platinum V] Zbalansowane słowa - 26692

[문제 링크](https://www.acmicpc.net/problem/26692)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 84, 정답: 34, 맞힌 사람: 19, 정답 비율: 54.286%

### 분류

수학, 자료 구조, 집합과 맵, 조합론, 해시를 사용한 집합과 맵

### 문제 설명

<p>Wszędzie najważniejsza jest r&oacute;wnowaga. Jest ona szczeg&oacute;lnie ważna przy organizacji konkurs&oacute;w programistycznych i mamy nadzieję, że jury tegorocznych Potyczek Algorytmicznych dobrze o tym wie.</p>

<p>Powiemy, że słowo jest zbalansowane, jeśli każda litera, kt&oacute;ra w nim występuje, występuje w nim tyle samo razy. Np. słowa <code>w</code>, <code>mama</code>, <code>potyczki</code> i <code>aabbcbcccbaa</code> są zbalansowane, podczas gdy słowa <code>oko</code>, <code>algorytmistrz</code> i <code>abcba</code> nie są. Mając dane długie słowo składające się jedynie ze znak&oacute;w <code>a</code>, <code>b</code> oraz <code>c</code>, policz, ile jego niepustych podsł&oacute;w (czyli sp&oacute;jnych przedział&oacute;w liter) jest zbalansowanych.</p>

<p>Uwaga: Dwa takie same słowa, występujące jako podsłowa na r&oacute;żnych pozycjach, liczymy wielokrotnie. Np. w słowie oko zbalansowanymi podsłowami są <code>o</code>, <code>k</code>, <code>o</code>, <code>ok</code> oraz <code>ko</code>.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się niepuste słowo, o długości nieprzekraczającej 300 000, składające się jedynie ze znak&oacute;w <code>a</code>, <code>b</code> oraz <code>c</code>.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca liczbę zbalansowanych podsł&oacute;w wejściowego słowa.</p>

### 힌트

<p>Wyjaśnienie przykładu: Zbalansowanymi podsłowami są: <code>a</code>, <code>aa</code>, <code>aabb</code>, <code>aabbab</code>, <code>aabbabccc</code>, <code>ab</code>, <code>abba</code>, <code>abc</code>, <code>b</code>, <code>ba</code>, <code>bb</code>, <code>bc</code>, <code>c</code>, <code>cb</code>, <code>cba</code>, <code>cc</code>, <code>ccc</code>. Zwr&oacute;ć uwagę, że niekt&oacute;re z nich występują kilkukrotnie.</p>