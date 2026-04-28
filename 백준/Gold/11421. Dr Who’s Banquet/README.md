# [Gold I] Dr Who’s Banquet - 11421

[문제 링크](https://www.acmicpc.net/problem/11421)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 67, 정답: 39, 맞힌 사람: 25, 정답 비율: 58.140%

### 분류

그래프 이론, 그리디 알고리즘, 정렬, 해 구성하기, 차수열

### 문제 설명

<p>Dr. Who is organising a banquet, and will be inviting several guests. A guest is happy, if he can chat with a fixed number of other guests. We assume that guests cannot talk to themselves. Help Dr. Who make all his guests happy, if possible, by organising chats between guests.</p>

### 입력

<p>The program input is from a text file. The file contains several data sets, and each data set is encoded on a line from the file. A data set consists of n&le;10000 positive integers a<sub>1</sub>, a<sub>2</sub>, &hellip; a<sub>n</sub>, separated by single whitespaces. The last integer an is immediately followed by the newline character. Each number a<sub>i</sub>, with 1&le;i&le;n is the number of chat partners guest i would like to have. We assume that a<sub>i</sub>&le;1000 for all 1&le;i&le;n. The last data set is followed by the end of file.</p>

### 출력

<p>If all guests can be made happy, the program output consists of a n&times;n matrix m, where m[i][j]=m[j][i]=1 if guests i and j chat, and m[i][j]=m[j][i]=0, otherwise. The matrix will be represented at standard output, as follows: each value m[i][j] from a row will be followed by one whitespace (including the last value from the row). Each row will be separated by the newline character. If it is not possible for all guests to be happy, then the program output is the message &ldquo;fail&rdquo;. The matrix and the message are allways followed by an empty line.</p>