# [Platinum V] Balanced Photo - 14449

[문제 링크](https://www.acmicpc.net/problem/14449)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 458, 정답: 327, 맞힌 사람: 292, 정답 비율: 73.367%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Farmer John is arranging his&nbsp;N&nbsp;cows in a line to take a photo (1 &le; N &le; 100,000). The height of the&nbsp;ith cow in sequence is&nbsp;h<sub>i</sub>, and the heights of all cows are distinct.</p>

<p>As with all photographs of his cows, FJ wants this one to come out looking as nice as possible. He decides that cow&nbsp;i&nbsp;looks &quot;unbalanced&quot; if&nbsp;L<sub>i </sub>and&nbsp;R<sub>i </sub>differ by more than factor of 2, where&nbsp;L<sub>i </sub>and&nbsp;R<sub>i</sub> are the number of cows taller than&nbsp;i&nbsp;on her left and right, respectively. That is,&nbsp;i&nbsp;is unbalanced if the larger of&nbsp;L<sub>i</sub> and&nbsp;R<sub>i</sub> is strictly more than twice the smaller of these two numbers. FJ is hoping that not too many of his cows are unbalanced.</p>

<p>Please help FJ compute the total number of unbalanced cows.</p>

### 입력

<p>The first line of input contains&nbsp;N. The next&nbsp;N&nbsp;lines contain&nbsp;h<sub>1</sub>&hellip;h<sub>N</sub>, each a nonnegative integer at most 1,000,000,000.</p>

### 출력

<p>Please output a count of the number of cows that are unbalanced.</p>

<p>&nbsp;</p>

### 힌트

<p>In this example, the cows of heights 34, 5, and 2 are unbalanced.</p>