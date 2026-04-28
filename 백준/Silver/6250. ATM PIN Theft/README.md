# [Silver II] ATM PIN Theft - 6250

[문제 링크](https://www.acmicpc.net/problem/6250)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

조합론, 구현, 수학

### 문제 설명

<p>Gabby the Good Guy is entering his PIN (password) on an ATM while Billy the Bad Buddy is looking over his shoulder to find his PIN. The keys on the ATM keypad are such that when pressed and held, several of that key may actually be entered. The numbered entered are displayed as &lsquo;*&rsquo; on the screen, so Billy may not be able to find out the exact PIN. He just knows the keys that Gabby has pressed (in order), but does not know how many times each has been entered into the ATM.</p>

<p>PINs are strings of exactly four digits (0 to 9). ATM has 10 keys for digits, plus one key for Backspace which deletes the last entered digit. Like other keys, if we press and hold Backspace, more than one digit may be deleted. Note that Billy sees in the correct order each key that Gabby has pressed (including the backspace key), but he does not know the number of times that the specified key has actually been entered. Although Gabby&rsquo;s PIN is a string of exactly four digits, he may press more than 4 keys including the keys deleted by Backspace as the ATM accepts any number of keys. He may also press less than 4 keys to produce his 4-digit key.</p>

<p>For example, suppose Billy sees that Gabby has first pressed &lsquo;1&rsquo;, then &lsquo;3&rsquo;, then &lsquo;5&rsquo;, and finally &lsquo;7&rsquo;. Since PINs have four digits and no backspace key has been pressed, then there can be only one PIN which is 1357. But in case the pressed keys are &lsquo;1&rsquo;, &lsquo;3&rsquo;, and &lsquo;5&rsquo; (in that order), the actual PIN may have been 1135, 1335, or 1355.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case has only a single integer n (0 &lt; n &lt; 10), which is the number of keys Gabby has pressed. The next line contains n space-separated integers that are either a single digit (0 to 9), or 99 which denotes the Backspace key. These are the sequence of keys that Gabby has pressed. You are guaranteed that the key 99 appears at most once in each test case but other keys may appear more than once. The input terminates with a line containing &ldquo;0&rdquo;.</p>

### 출력

<p>For each test case, write a single line containing the number of possible PINs consistent with the given sequence of pressed keys. Of course, if there is no PIN consistent with the given sequence of pressed keys, the output must be 0.</p>