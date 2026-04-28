# [Silver IV] Valya and Letter - 19729

[문제 링크](https://www.acmicpc.net/problem/19729)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 209, 정답: 58, 맞힌 사람: 46, 정답 비율: 24.599%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>Valya got bored with social media, so she decided to write a good old handwritten letter to her friend. Valya wrote the letter on a rectangular sheet of paper. The sheet&#39;s dimensions are equal to $n$ and $m$ cm. Then she found a rectangular envelope with dimensions equal to $h$ and $w$ cm.</p>

<p>Unfortunately the letter could be too big to be placed into the envelope. So she might need to fold it several times. In one move Valya can fold the letter in half vertically or horizontally.</p>

<p>After folding the letter if necessary, Valya would put it into the envelope. Valya is a perfectionist, so she would always put the letter into the envelope in such way that its sides are parallel to the envelope&#39;s sides. The letter can be placed into the envelope if its corresponding dimensions don&#39;t exceed the envelope&#39;s dimensions. Before placing the letter Valya can rotate it by $90$ degrees. For example, if the letter&#39;s dimensions are equal to $10$ and $20$ cm, and the envelope&#39;s dimensions are equal to $20$ and $10$ cm, Valya doesn&#39;t need to fold the letter, she can rotate it by $90$ degrees to fit it into the envelope.</p>

<p>Valya doesn&#39;t want the letter to be crumpled so she wants to fold it the minimal possible number of times. Help her find this number.</p>

### 입력

<p>The first line of the input contains four integers $n$, $m$, $h$ and $w$ denoting the dimensions of the letter and dimensions of the envelope, respectively ($1 \leq n, m, h, w \leq 10^{18}$).</p>

### 출력

<p>Output one number --- the minimal number of folds required, so that Valya could put the letter into the envelope.</p>