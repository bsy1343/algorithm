# [Silver I] The One Dollar Gambler - 10619

[문제 링크](https://www.acmicpc.net/problem/10619)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 235, 정답: 95, 맞힌 사람: 51, 정답 비율: 52.577%

### 분류

수학, 확률론, 기댓값의 선형성

### 문제 설명

<p>Starting with one dollar of capital, a gambler chooses a fixed proportion, F, of his capital to bet on a fair coin toss repeatedly for T tosses.</p>

<p>His return is double his bet for heads and he loses his bet for tails.</p>

<p>For example, if F=1/4, for the first toss he bets 0.25\$, and if heads comes up he wins 0.5\$ and so then have 1.5\$. He then bets 0.375\$ and if the second toss is tails, he has 1.125\$ left.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10619.%E2%80%85The%E2%80%85One%E2%80%85Dollar%E2%80%85Gambler/c57c38a4.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/10619.%E2%80%85The%E2%80%85One%E2%80%85Dollar%E2%80%85Gambler/c57c38a4.png" data-original-src="https://www.acmicpc.net/upload/images2/lahore4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:255px; width:228px" />The diagram on the right shows the possibilities in two coin tosses. If both times head comes, his worth is 2.25\$, if one head and one tail comes in either order, his worth is 1.125\$, and in case it is tails both times, he is left with 0.5625\$. All four cases are equally probable. The expected worth of the one dollar gambler is therefore 1.265625 after a two toss game.</p>

<p>Your task in this problem is to find the expected worth of the one dollar gambler given F, the fraction of current worth to bet on the next toss and T, the total number of coin tosses.</p>

### 입력

<p>The input consists of multiple test cases. The first line of input is the number of test cases N (1&le;N&le;100). Each of the following N lines contains a float point number F (0&le;F&le;1), the fraction of current worth to bet and T (1&le;T&le;100), the number of coin tosses.</p>

### 출력

<p>For each test case, print a single line saying &ldquo;Case #n:&rdquo; where n is the test case number followed by a space followed by the expected worth of the one dollar gambler. Small absolute or relative errors(10<sup>-6</sup>) are acceptable in the output.</p>