# [Gold II] Dominosa - 9959

[문제 링크](https://www.acmicpc.net/problem/9959)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 4, 맞힌 사람: 3, 정답 비율: 30.000%

### 분류

백트래킹

### 문제 설명

<p>A set of dominoes, that is, one instance of every unordered pair of the numbers from 0 to n, has been arranged irregularly into a rectangle and the pattern has been recorded by writing the number in each square. For instance, in the figure below the original layout, using a &#39;standard&#39; set (n = 6) of dominoes, is on the left and the puzzle configuration is on the right. Write a program to recreate the original configuration, guaranteed to exist and to be unique.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9959.%E2%80%85Dominosa/7521625a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9959.%E2%80%85Dominosa/7521625a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9959/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:269px; width:616px" /></p>

### 입력

<p>Input will consist of a series of puzzles. Each puzzle will start with a line containing an integer n (2&nbsp;&le; n &le; 12). Following this will be n rows each containing n+1 characters from the first n+1 letters of the lower case alphabet, separated by single spaces. The set of puzzles will be terminated by a line containing a single zero (0). The above puzzle is represented in this form in the sample input.</p>

### 출력

<p>Output will consist of a representation of the original grid in the same format as the input, except that a pair of letters constituting a horizontal domino are separated by an equals sign (&lsquo;=&rsquo;), as shown in the sample output below. Leave a blank line between successive grids.</p>