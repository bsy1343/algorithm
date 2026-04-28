# [Bronze I] Bold - 21221

[문제 링크](https://www.acmicpc.net/problem/21221)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 203, 정답: 177, 맞힌 사람: 159, 정답 비율: 86.885%

### 분류

구현

### 문제 설명

<p>In addition to the usual age-related health problems such as first signs of RSI<sup>1</sup> and physical injuries that accumulate faster than they heal, Daniel&rsquo;s eyesight has suddenly worsened.</p>

<p>Paula wrote him a letter, but he can&rsquo;t read it without glasses. She needs to <strong>bold</strong> the text, so Daniel can read it.</p>

<p>The letter can be represented as a matrix consisting of characters &#39;<code>.</code>&#39; and &#39;<code>#</code>&#39;. To bold it, Paula will replace each &#39;<code>#</code>&#39; in the original letter with a 2 &times; 2 square of &#39;<code>#</code>&#39; in the down-right direction.</p>

<p><sup>1</sup>Repetitive strain injury. Never ignore the pain caused by typing. Ergonomic aids and chairs are generally always worth it. Sit straight. &ldquo;A gram of prevention is worth a kilo of cure.&rdquo;</p>

### 입력

<p>The first line contains integers n and m (2 &le; n, m &le; 100), the dimensions of the letter.</p>

<p>Each of the following n lines contains m characters &#39;<code>.</code>&#39; and &#39;<code>#</code>&#39; that represent Paula&rsquo;s letter.</p>

<p>The last row and column won&rsquo;t contain any &#39;<code>#</code>&#39;.</p>

### 출력

<p>Output n lines containing m characters &#39;<code>.</code>&#39; and &#39;<code>#</code>&#39;, representing the bold letter.</p>