# [Bronze II] Cryptographer’s Conundrum - 11269

[문제 링크](https://www.acmicpc.net/problem/11269)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 381, 정답: 349, 맞힌 사람: 310, 정답 비율: 91.716%

### 분류

구현, 문자열

### 문제 설명

<p>The walls of the corridors at the Theoretical Computer Science group (TCS) at KTH are all but covered with whiteboards. Some of the faculty members are cryptographers, and like to write cryptographic puzzles on the whiteboards. A new puzzle is added whenever someone discovers a solution to the previous one.</p>

<p>When Per walked in the corridor two weeks ago, he saw that the newest puzzle read &ldquo;<code>GuvfVfNGrfg</code>&rdquo;. After arriving at his computer, he quickly figured out that this was a simple ROT13 encryption of &ldquo;<code>ThisIsATest</code>&rdquo;.</p>

<p>The series of lousy puzzles continued next week, when a new puzzle read &ldquo;<code>VmkgdGFyIHPDpGtlcmhldGVuIHDDpSBzdMO2cnN0YSBhbGx2YXIK</code>&rdquo;. This was just base64-encoded text! &ldquo;Enough with these pranks&rdquo;, Per thought; &ldquo;I&rsquo;m going to show you!&rdquo;</p>

<p>Now Per has come up with a secret plan: every day he will erase one letter of the cipher text and replace it with a different letter, so that, in the end, the whole text reads &ldquo;<code>PerPerPerPerPerPerPer</code>&rdquo;. Since Per will change one letter each day, he hopes that people will not notice.</p>

<p>Per would like to know how many days it will take to transform a given cipher text into a text only containing his name, assuming he substitutes one letter each day. You may assume that the length of the original cipher text is a multiple of 3.</p>

<p>For simplicity, you can ignore the case of the letters, and instead assume that all letters are upper-case.</p>

### 입력

<p>The first and only line of input contains the cipher text on the whiteboard. It consists of at most 300 upper-case characters, and its length is a multiple of 3.</p>

### 출력

<p>Output the number of days needed to change the cipher text to a string containing only Per&rsquo;s name.</p>