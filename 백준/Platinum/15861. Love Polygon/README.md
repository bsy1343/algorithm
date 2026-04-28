# [Platinum II] Love Polygon - 15861

[문제 링크](https://www.acmicpc.net/problem/15861)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 19, 맞힌 사람: 18, 정답 비율: 41.860%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>As we all know, TV soap operas with many characters can lead to seriously complicated love dramas. In one TV show, there are N characters. Each character loves exactly one character (which could actually be him- or herself). We say that two characters are in a relationship if and only if they love each other.</p>

<p>One particular type of complication is called a &ldquo;love polygon&rdquo;. We say that 3 or more characters are in a &ldquo;love polygon&rdquo; if the first character loves the second, the second loves the third and so on, and also the last character loves the first.</p>

<p>Recent polling has shown that viewers have grown tired of this drama and would prefer something more romantic. Therefore, it was decided to shoot some characters with love arrows so that everyone is in a relationship. By shooting someone with a love arrow, you can change whom that character loves (to any character of your choice).</p>

<p>What is the least number of love arrows needed to get everyone into a relationship?</p>

### 입력

<p>The first line of the input contains the integer N, the number of characters involved. The next N lines all contain two space-separated names s and t, meaning that the character named s initially loves the character named t. Names of the characters are no more than 10 letters long and consist of lowercase English letters.</p>

### 출력

<p>Output one integer &ndash; the minimum number of love arrows needed to get everyone into a relationship. If this is not possible, output -1.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15861/1.png" style="width: 441px; height: 250px;" /></p>

<p>The first example is illustrated in the figure above. The upper part shows the initial love situation, where an arrow pointing from s to t indicates that s initially loves t, and the pink color highlights the three characters that needs to be shot with love arrows in the unique optimal solution. The lower part shows the situation afterwards.</p>

<p>In the second example (which satisfies the constraints of group 3), there are several optimal solutions. One of them is to shoot a, b and d with love arrows, and have them fall in love with b, a and c, respectively.</p>

<p>In the third example, we have a love triangle, where no matter how many love arrows we shoot, someone will always be left out.</p>