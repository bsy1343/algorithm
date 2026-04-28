# [Gold II] Mixing Drinks - 17926

[문제 링크](https://www.acmicpc.net/problem/17926)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 이분 탐색, 누적 합

### 문제 설명

<p>Pia is a famous bartender at the hip Stockholm night club Supernova. One of her most impressive feats is the mixing a series of drinks using each of the $N$ distinct drink ingredients in the bar exactly once. She does this in the following way.</p>

<p>First, Pia chooses a number of drinks to make. Each of the drink ingredients are then lined up in front of her in order $1, 2, \dots, N$. For the first drink, she uses some positive number $K$ of ingredients starting from the left, i.e. $1, 2, ..., K$. For the next drink, she uses some positive number $L$ of ingredients starting from the first unused ingredient, i.e. $K + 1, K + 2, \dots, K + L$. She continues this process until the final drink, which uses some set of ingredients $N - M, N - M + 1, \dots, N$.</p>

<p>However, not every pair of ingredients work well in a drink. For example, milk and water would not go very well together. She may not include a bad pair of ingredients in any drink.</p>

<p>So far, she has managed to make a different set of drinks every night. For how many nights can she mix a new set of drinks? We call two sets of drinks different if they do not consist of the exact same drinks (though they are allowed to have drinks in common).</p>

### 입력

<p>The first line of the input contains two integers $1 \le N \le 100\,000$ and $0 \le P \le 100\,000$, the number of ingredients and bad pairs of ingredients.</p>

<p>Each of the next $P$ lines contains two integers $1 \le a \not= b \le N$, two ingredients that do not work well together in a drink. The same pair of ingredients may appear multiple times in this list.</p>

### 출력

<p>Output a single integer, the number of nights Pia can construct a different set of drinks. Since this number may be large, output the remainder when divided by $10^9 + 7$.</p>