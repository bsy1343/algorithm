# [Platinum V] Playing With Domino - 7807

[문제 링크](https://www.acmicpc.net/problem/7807)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 6, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

브루트포스 알고리즘, 오일러 경로, 그래프 이론

### 문제 설명

<p>A domino is a 2x1 rectangular tile with a line dividing its face into two squares, each with a certain number of dots from zero spots to six spots. As you might know, there are many different games which can be played using dominoes. In most games, dominoes are played by arranging them into a single chain where adjacent dominoes must have matching numbers (see example illustration below).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7807.%E2%80%85Playing%E2%80%85With%E2%80%85Domino/3de42b5f.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7807.%E2%80%85Playing%E2%80%85With%E2%80%85Domino/3de42b5f.gif" data-original-src="https://www.acmicpc.net/upload/images2/domino.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:206px; width:500px" /></p>

<p>There are 28 possible faces in a complete set of domino: 0-0, 0-1, 0-2, 0-3, 0-4, 0-5, 0-6, 1-1, 1-2, 1-3, 1-4, 1-5, 1-6, 2-2, 2-3, 2-4, 2-5, 2-6, 3-3, 3-4, 3-5, 3-6, 4-4, 4-5, 4-6, 5-5, 5-6, 6-6. Of course you can play each domino in either direction. For example, you can play 1-6 as 1/6 or 6/1 depending on your need.</p>

<p>Write a program to find the longest chain that can be made from a given set of dominoes. There may be more than one domino with the same face.</p>

### 입력

<p>Input contains several cases. Each case begins with an integer N (1 &lt;= N &lt;= 1,000) denoting the number of available domino. Each of the following N lines contains a pair of number (0 to 6) which represents the domino. The first number in each pair is always smaller or equal to the second number.</p>

<p>&nbsp;</p>

### 출력

<p>For each case, print in a single line the number of domino used in the longest domino chain.</p>

<p>&nbsp;</p>