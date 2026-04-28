# [Platinum II] Promotion Counting - 14446

[문제 링크](https://www.acmicpc.net/problem/14446)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1028, 정답: 460, 맞힌 사람: 364, 정답 비율: 48.991%

### 분류

자료 구조, 정렬, 트리, 세그먼트 트리, 오일러 경로 테크닉, 머지 소트 트리

### 문제 설명

<p>&nbsp;</p>

<p>The cows have once again tried to form a startup company, failing to remember from past experience that cows make terrible managers!</p>

<p>The cows, conveniently numbered&nbsp;1&hellip;N (1 &le; N &le; 100,000), organize the company as a tree, with cow 1 as the president (the root of the tree). Each cow except the president has a single manager (its &quot;parent&quot; in the tree). Each cow&nbsp;i&nbsp;has a distinct proficiency rating,&nbsp;p(i), which describes how good she is at her job. If cow&nbsp;ii&nbsp;is an ancestor (e.g., a manager of a manager of a manager) of cow&nbsp;j, then we say j&nbsp;is a subordinate of&nbsp;i.</p>

<p>Unfortunately, the cows find that it is often the case that a manager has less proficiency than several of her subordinates, in which case the manager should consider promoting some of her subordinates. Your task is to help the cows figure out when this is happening. For each cow&nbsp;i&nbsp;in the company, please count the number of subordinates&nbsp;j&nbsp;where&nbsp;p(j)&gt;p(i).</p>

<p>&nbsp;</p>

### 입력

<p>The first line of input contains&nbsp;N.</p>

<p>The next&nbsp;NN&nbsp;lines of input contain the proficiency ratings&nbsp;p(1)&hellip;p(N) for the cows. Each is a distinct integer in the range&nbsp;1&hellip;1,000,000,000.</p>

<p>The next&nbsp;N&minus;1 lines describe the manager (parent) for cows&nbsp;2&hellip;N. Recall that cow 1 has no manager, being the president.</p>

<p>&nbsp;</p>

### 출력

<p>Please print&nbsp;N&nbsp;lines of output. The&nbsp;iith line of output should tell the number of subordinates of cow&nbsp;i&nbsp;with higher proficiency than cow&nbsp;i.</p>