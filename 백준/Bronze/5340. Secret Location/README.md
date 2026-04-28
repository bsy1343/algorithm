# [Bronze III] Secret Location - 5340

[문제 링크](https://www.acmicpc.net/problem/5340)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 811, 정답: 449, 맞힌 사람: 407, 정답 비율: 57.977%

### 분류

구현, 문자열

### 문제 설명

<p>Someone is waiting at a secret location and has sent a text message with the coordinates of their location. The message contains the latitude and longitude coordinates in degrees, minutes, and seconds. Of course, the message is encoded so you must write a program to decode the message. The message is 6 lines and the number of characters in each line corresponds to the coordinates of the secret location.</p>

### 입력

<p>There are six lines of input.</p>

### 출력

<p>There should be two lines of output. The first line will start with the word Latitude followed by three positive integers and the integers will be separated by colons. The second line will start with the word Longitude followed by three positive integers and the integers will be separated by colons. The output should have the following format.</p>

<pre>
Latitude x<sub>1</sub>:x<sub>2</sub>:x<sub>3</sub>
Longitude x<sub>4</sub>:x<sub>5</sub>:x<sub>6</sub></pre>

<p>There should be one space between the first word on each line and the first positive integer on the line. The variable x<sub>i</sub> (1&le; i &le; 6) is the number of characters in the ith line of input.</p>