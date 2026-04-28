# [Platinum IV] Corporate Identity - 6654

[문제 링크](https://www.acmicpc.net/problem/6654)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 12, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

문자열, 이분 탐색, 집합과 맵, 해싱, 접미사 배열과 LCP 배열

### 문제 설명

<p>Beside other services, ACM helps companies to clearly state their &ldquo;corporate identity&rdquo;, which includes company logo but also other signs, like trademarks. One of such companies is Internet Building Masters (IBM), which has recently asked ACM for a help with their new identity. IBM do not want to change their existing logos and trademarks completely, because their customers are used to the old ones. Therefore, ACM will only change existing trademarks instead of creating new ones.</p>

<p>After several other proposals, it was decided to take all existing trademarks and find the longest common sequence of letters that is contained in all of them. This sequence will be graphically emphasized to form a new logo. Then, the old trademarks may still be used while showing the new identity.</p>

<p>Your task is to find such a sequence.</p>

### 입력

<p>The input contains several tasks. Each task begins with a line containing a positive integer N, the number of trademarks (2 &le; N &le; 4000). The number is followed by N lines, each containing one trademark. Trademarks will be composed only from lowercase letters, the length of each trademark will be at least 1 and at most 200 characters.</p>

<p>After the last trademark, the next task begins. The last task is followed by a line containing zero.</p>

### 출력

<p>For each task, output a single line containing the longest string contained as a substring in all trademarks. If there are several strings of the same length, print the one that is lexicographically smallest. If there is no such non-empty string, output the words &ldquo;IDENTITY LOST&rdquo; instead.</p>