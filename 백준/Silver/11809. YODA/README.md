# [Silver V] YODA - 11809

[문제 링크](https://www.acmicpc.net/problem/11809)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 442, 정답: 300, 맞힌 사람: 282, 정답 비율: 70.500%

### 분류

수학, 구현, 문자열

### 문제 설명

<p>A long, long time ago in a galaxy far, far away a big collision of integers is taking place right now. What happens when two integers collide? During collision, each digit of one number compares itself to the corresponding digit of the other number (the least significant digit with the other&rsquo;s least significant digit, and so on). The smaller digit &ldquo;falls out&rdquo; of the number containing it. Additionally, if the digits are the same, nothing happens. If a number doesn&rsquo;t consist of a corresponding digit, then we consider it to be zero. After all comparisons of corresponding digits, the leftover digits in the number come closer and create a new number. For example:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/11809.%E2%80%85YODA/2ea2d51a.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/11809.%E2%80%85YODA/2ea2d51a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11809/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:100px; width:517px" /></p>

<p>Write a programme that will, for two given integers, determine their values after collision. If it happens that all the digits of one number fell out, then for that number output the message &ldquo;YODA&rdquo;.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 10<sup>9</sup>), one of the integers from the task. The second line of input contains the integer M (1 &le; N &le; 10<sup>9</sup>), one of the integers from the task.</p>

### 출력

<p>The first line of output must contain the new value of the first given integer from the task. The second line of output must contain the new value of the second given integer from the task.</p>