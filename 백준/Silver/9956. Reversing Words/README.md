# [Silver II] Reversing Words - 9956

[문제 링크](https://www.acmicpc.net/problem/9956)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 45, 맞힌 사람: 41, 정답 비율: 70.690%

### 분류

구현, 문자열

### 문제 설명

<p>&ldquo;Oh no, not another reversing problem! We did those in Programming 101, years ago&rdquo;, I hear you cry. Well yes, but this problem is just a little different, in that you have to reverse individual words, not entire sentences. Furthermore, only the letters are to be reversed &mdash; spaces, punctuation and case are unaffected.</p>

<p>For this problem a word is defined to be a sequence of characters containing at least two letters and delimited by whitespace. The letters in the word must be written in reverse order (so &#39;the&#39; becomes &#39;eht&#39;), but the other characters in the word remain in their original sequence. Furthermore, if a character in the original word is upper-case, the letter in the same position in the new word must also be uppercase, thus &#39;Smith-Jones&#39; becomes &#39;Senoj-Htims&#39;. The position of the word in the line must be unaltered, and the position of every non-letter must also be unaltered (so double blanks remain as double blanks).</p>

### 입력

<p>Input will be a series of lines, terminated by a line consisting of a single &#39;#&#39;. No line will have more than 80 characters.</p>

### 출력

<p>Output will consist of a series of lines, one for each line in the input, with the letters in each word reversed as described above.</p>