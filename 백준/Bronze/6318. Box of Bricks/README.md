# [Bronze II] Box of Bricks - 6318

[문제 링크](https://www.acmicpc.net/problem/6318)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 800, 정답: 332, 맞힌 사람: 286, 정답 비율: 39.833%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Little Bob likes playing with his box of bricks. He puts the bricks one upon another and builds stacks of different height. &ldquo;Look, I&rsquo;ve built a wall!&rdquo;, he tells his older sister Alice. &ldquo;Nah, you should make all stacks the same height. Then you would have a real wall.&rdquo;, she retorts. After a little consideration, Bob sees that she is right. So he sets out to rearrange the bricks, one by one, such that all stacks are the same height afterwards. But since Bob is lazy he wants to do this with the minimum number of bricks moved. Can you help?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/6318.%E2%80%85Box%E2%80%85of%E2%80%85Bricks/63468c16.png" data-original-src="https://www.acmicpc.net/upload/images2/brick.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:428px" /></p>

### 입력

<p>The input consists of several data sets. Each set begins with a line containing the number n of stacks Bob has built. The next line contains n numbers, the heights hi of the n stacks. You may assume 1 &le; n &le; 50 and 1 &le; hi &le; 100.</p>

<p>The total number of bricks will be divisible by the number of stacks. Thus, it is always possible to rearrange the bricks such that all stacks have the same height.</p>

<p>The input is terminated by a set starting with n 0. This set should not be processed.</p>

### 출력

<p>For each set, first print the number of the set, as shown in the sample output. Then print the line &ldquo;The minimum number of moves is k.&rdquo;, where k is the minimum number of bricks that have to be moved in order to make all the stacks the same height.</p>

<p>Output a blank line after each set.</p>