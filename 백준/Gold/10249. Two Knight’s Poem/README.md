# [Gold I] Two Knight’s Poem - 10249

[문제 링크](https://www.acmicpc.net/problem/10249)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 96, 정답: 25, 맞힌 사람: 25, 정답 비율: 26.596%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Two chess knights have decided to collaborate on writing short, one-line poems. They have obtained the use of a laptop to type their poetry. The laptop keyboard is composed of 4 rows of 10 keys. 30 of these are symbol keys, 4 are Shift keys, and 6 are Space keys.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10249.%E2%80%85Two%E2%80%85Knight%E2%80%99s%E2%80%85Poem/8867ebc2.png" data-original-src="https://www.acmicpc.net/upload/images2/keyboard.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:208px; width:595px" /></p>

<p>Note that the Shift and Space keys, which are usually extra-wide keys on a keyboard, are treated here as multiple individual keys that each have the same effect.</p>

<p>The knights will type the poem by making moves, one at a time, that are valid for a chess knight. A chess knight can move two positions vertically and then one horizontally, or one position vertically and then two horizontally. For example, from the D key, a knight can move to any of these keys: Q, Z, T, B, the second Shift key from the left, and the second Space key from the left.</p>

<p>One knight always begins each poem on the left-most Shift key. The other knight always begins on the right-most Shift key. Either knight may move first, and either may make multiple consecutive moves. The knights cannot occupy the same key.</p>

<p>Each move of a knight will type at most one character, adding to the poem. Landing on a symbol key or Space key will type one character. A knight landing on a symbol key types the upper value of that key when the other knight is on a Shift key; otherwise, the lower value is typed. Landing on a Space key always types a single space character, regardless of whether the other knight is on a Shift key. Landing on a Shift key does not add anything to the poem.</p>

### 입력

<p>There will be several test cases in the input. Each test case will consist of a string on a single line, representing a poem. Each poem will consist of 1 to 100 characters inclusive, using only characters from the symbol keys on the keyboard and spaces. No poem will begin or end with a space. The input will end with a line with a single asterisk (&lsquo;*&rsquo;).</p>

### 출력

<p>For each poem, output 1 if the knights can type the poem, or 0 if they cannot. Output each number on its own line, with no spaces. Do not print any blank lines between outputs.</p>