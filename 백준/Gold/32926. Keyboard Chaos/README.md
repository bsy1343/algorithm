# [Gold III] Keyboard Chaos - 32926

[문제 링크](https://www.acmicpc.net/problem/32926)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 21, 맞힌 사람: 20, 정답 비율: 83.333%

### 분류

문자열, 애드 혹

### 문제 설명

<p>Haven't you ever thought that an ordinary flat keyboard is boring, and you can come up with something more interesting?</p>

<p>A little boy named Kevin came up with a keyboard with $n$ unusual keys. Each key $i$ initially contains a sequence of letters: $L_{i, 1}, L_{i, 2}, \ldots, L_{i, |L_{i}|}$. Some letters in this sequence can be equal. Each letter is one of the first $e$ lowercase English letters.</p>

<p>Every time key $i$ is pressed, the first letter of its sequence is typed and immediately moved to the end of the sequence. Thus, the first time key $i$ is pressed, letter $L_{i, 1}$ is typed, and the sequence becomes $L_{i, 2}, \ldots, L_{i, |L_{i}|}, L_{i, 1}$. The second time key $i$ is pressed, letter $L_{i, 2}$ is typed, and the sequence becomes $L_{i, 3}, \ldots, L_{i, |L_{i}|}, L_{i, 1}, L_{i, 2}$, and so on.</p>

<p>For example, suppose that key $1$ contains the sequence '<code>a</code>', '<code>b</code>', '<code>a</code>', and key $2$ contains the sequence '<code>c</code>', '<code>d</code>'. Then, if you press keys $2, 1, 2, 2, 1, 1, 1, 2$ in this order, the string "<code>cadcbaad</code>" will be typed.</p>

<p>Help Kevin understand how useful his keyboard is, and find the shortest possible string consisting of the first $e$ lowercase English letters that cannot be typed with such a keyboard from the given initial state.</p>

### 입력

<p>The first line contains two integers $n$ and $e$, denoting the number of keys and the size of the alphabet ($1 \le n \le 100$; $2 \le e \le 26$).</p>

<p>The $i$-th of the following $n$ lines consists of characters $L_{i,1}, L_{i,2}, \ldots, L_{i, |L_i|}$, denoting the sequence of letters key $i$ initially contains ($1 \le |L_{i}| \le 10$). Every character is one of the first $e$ lowercase English letters.</p>

### 출력

<p>Print the shortest possible string, consisting of the first $e$ lowercase English letters, that can not be typed using Kevin's keyboard from the initial state. If there are multiple shortest strings, print any of them.</p>

<p>If any string can be typed, print a single string "<code>NO</code>" instead.</p>

### 힌트

<p>In the first test, the only strings that can be typed with Kevin's keyboard are prefixes of "<code>winwinwinwin...</code>". Since you can not start the string with any letter other than '<code>w</code>', any lowercase English letter except '<code>w</code>' is a correct answer.</p>

<p>In the second test, "<code>bb</code>" and "<code>cc</code>" are other possible answers.</p>