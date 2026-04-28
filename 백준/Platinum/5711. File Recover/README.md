# [Platinum III] File Recover - 5711

[문제 링크](https://www.acmicpc.net/problem/5711)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

수학, 문자열, 조합론, 접미사 배열과 LCP 배열

### 문제 설명

<p>Your school has a computer that is used as a web server for hosting its institutional web site, personal pages of the staff, sites for research groups, subjects, and many others.</p>

<p>Recently, the hard disk table was corrupted, so the organization of all the files was lost. Sadly enough, there are no backups of that information. The only hope is to look through the entire disk data and try to find out which parts correspond to each file. Fortunately, the disk was using a file system that kept each individual file contiguous, so only contiguous pieces of data need to be inspected.</p>

<p>The disk data is a sequence of bytes. Each byte in this particular disk can store an English alphabet letter (distinguishing lowercase and uppercase), a decimal digit, a point or a comma, making a total of 64 different characters.</p>

<p>While you were thinking about how to solve the problem, you suddenly remembered that the file system also maintained multiple copies of each file, so only the pieces of contiguous bytes that are repeated had a chance of being a file. Moreover, for each repetition of the same contiguous bytes, only one copy needs to be checked. For instance, if the data is &lsquo;ababcabb&rsquo;, the contiguous subsequences &lsquo;a&rsquo;, &lsquo;b&rsquo; and &lsquo;ab&rsquo; are repeated, but nothing containing &lsquo;c&rsquo;, nor &lsquo;ba&rsquo; or &lsquo;bb&rsquo; is. Therefore, we have 3 pieces of contiguous bytes that need checking in this case.</p>

<p>You decide to write a program that computes exactly how many sequences need checking, that is, the number of different sequences of contiguous bytes that appear at least twice in the data.</p>

### 입력

<p>There are several test cases. The input of each test case is given in exactly one line, containing a non-empty string of at most 10<sup>5</sup> characters that represents the disk data. Each character in the string is either a lowercase letter, an uppercase letter, a digit, a point or a comma. The last test case is followed by a line containing a single asterisk.</p>

### 출력

<p>For each test case output a single line with an integer, representing the number of different contiguous subsequences that appear at least twice in the input string.</p>