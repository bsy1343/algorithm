# [Bronze I] Text Roll - 9494

[문제 링크](https://www.acmicpc.net/problem/9494)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4279, 정답: 1475, 맞힌 사람: 1198, 정답 비율: 35.602%

### 분류

구현, 문자열

### 문제 설명

<p>Take some text. Put a small ball at the top of the first letter of the first word of the first sentence. The ball is drawn via gravity downwards. The text is also at a slight angle, so the ball wants to also move towards the right. The ball can freely move between the lines, and can drop through spaces. Considering the first column to be column 1, what column will the ball end up in? In this example, the ball ends up in column 8.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/9494.%E2%80%85Text%E2%80%85Roll/3c78313c.png" data-original-src="https://www.acmicpc.net/upload/images/a.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:125px; width:556px" /></p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with an integer n (1&le;n&le;1,000) on its own line, indicating the number of lines of text. On each of the next n lines will be text, consisting of printable ASCII characters and spaces. There will be no tabs, nor any other unprintable characters. Each line will be between 1 and 100 characters long. The input will end with a line containing a single 0.&nbsp;</p>

### 출력

<p>For each test case, output a single integer on its own line, indicating the column from which the ball will drop. Output no spaces, and do not separate answers with blank lines.&nbsp;</p>