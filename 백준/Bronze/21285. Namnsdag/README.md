# [Bronze II] Namnsdag - 21285

[문제 링크](https://www.acmicpc.net/problem/21285)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 142, 정답: 110, 맞힌 사람: 100, 정답 비율: 81.967%

### 분류

구현, 문자열

### 문제 설명

<p>Your friend likes money. When your friend has a name day he or she gets money from their nice aunt, hence your friend really enjoys when they have a name day.</p>

<p>It happens to be your friend&#39;s name day today, and your friend is considering how they could avoid having to wait another whole year before it&#39;s time for name day again. You&#39;ve been asked to help out.</p>

<p>Your friend is planning to replace exactly one letter in their name in order to have a name day as soon as possible again. Given a list of name days for the coming year, please help your friend decide how soon they can have a name day again. It&#39;s forbidden to add or erase characters, you may only replace exactly one character with exactly one other character.</p>

<p>If it&#39;s impossible to find a name that can be reached with the above listed allowed actions, your friend will simply have to wait a whole year.</p>

### 입력

<p>Input starts with a single string, the name of your friend. Then follows an integer $N$ on one row, the number of days in the coming year. After that follows $N$ strings, the name days for days in the coming year.</p>

<p>The $N$:th name will always be the name of your friend, since it&#39;s their name day today and hence also in exactly one year again. The names in the input consist solely of characters <code>a-z</code>, contain no spaces and are at most 10 characters long. All names for the coming year will be different.</p>

### 출력

<p>Output a single integer on a single line: the minimum number of days before it&#39;s time for name day again, if you help your friend cheat with their name.</p>

### 힌트

<p>In the first sample input your friend&#39;s name is <code>anna</code>. She can make the name <code>anja</code> by replacing the second <code>n</code> in her name with a <code>j</code>, and thus she has a name day two days earlier than expected. Thus the answer is 3. In the second sample input it&#39;s impossible to create another name using the above listed actions, so <code>jan</code> will have to wait a whole year, 3 days.</p>