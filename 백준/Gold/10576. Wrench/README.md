# [Gold I] Wrench - 10576

[문제 링크](https://www.acmicpc.net/problem/10576)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 29, 정답: 17, 맞힌 사람: 17, 정답 비율: 68.000%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10576.%E2%80%85Wrench/82490d7e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10576.%E2%80%85Wrench/82490d7e.png" data-original-src="https://www.acmicpc.net/upload/images2/wrench.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:92px; width:84px" /></p>

<p>Peter works at a factory. He is looking at a list of wrench sizes and needs to find the appropriately sized wrench for various screws and nuts and bolts to do his work. Normally, these sizes are specified using US Customary Unit notation such as 13/16&rdquo;, or 3/8&rdquo;, and so on.</p>

<p>Another way to write 13/16&rdquo; is 0.8125&rdquo;</p>

<p>But the reference sheets for various parts round the numbers in weird ways, and give approximations only, so for example 13/16&rdquo; might turn into 0.812, or 0.813, or sometimes just 0.81, depending on the method of rounding.</p>

<p>Given that Peter is looking for a wrench of size A/B&rdquo;, and it is customary for B to be a power of 2, help Peter find the correct wrench size, where A is a positive integer and B is the minimum possible base (power of 2).</p>

### 입력

<p>Input starts with the number of test cases, T, on a single line, with 1 &le; T &le; 100. Each test case is a single decimal number on its own line representing a wrench size, with at most six digits after the decimal point. There need not always be a decimal point. The input value will be greater than zero.</p>

### 출력

<p>A/B&rdquo;, or C A/B&rdquo;, or C&rdquo;, where B is the minimal power of two such that the exact decimal representation rounded to the number of decimal digits of the input matches the input, using one of the following rounding rules: round up (ceiling), round down (or truncate), or round-to-nearest. The wrench will be less than or equal to 10 inches. There will always be a valid power of two less than or equal to 128.</p>