# [Platinum III] Henry Porter and the Palindromic Radius - 18050

[문제 링크](https://www.acmicpc.net/problem/18050)

### 성능 요약

시간 제한: 25 초, 메모리 제한: 512 MB

### 통계

제출: 155, 정답: 32, 맞힌 사람: 28, 정답 비율: 24.138%

### 분류

매내처, 문자열

### 문제 설명

<p>A young wizard, Henry Porter, has just received sad news &ndash; the eldest of his family, uncle Markus Radius Palindromus Black, passed away. Uncle Markus had a reputation of being a quite eccentric person, using complicated binary magic, and was also known to be very, very rich.</p>

<p>Black&rsquo;s will states that Henry should inherit his mysterious chamber of treasures. To enter and claim it, however, the young wizard must say the right password <em>H</em>, which is a word of length <em>n</em>, consisting of characters 0 and 1. Uncle Markus did not tell Henry the password &ndash; it certainly wouldn&rsquo;t be his style. Instead, he computed, for every <em>x</em> = 1, 2, . . . , <em>n</em>, the <em>palindromic radius</em> <em>p<sub>x</sub></em>&nbsp;&ndash; the largest possible integer such that the word <em>H</em>[<em>x</em> &minus; <em>p<sub>x</sub></em> .. <em>x</em> + <em>p<sub>x</sub></em>] of length 2<em>p<sub>x</sub></em> + 1 centered at <em>H</em>[<em>x</em>] exists and is a palindrome. Henry then only received the values <em>p</em><sub>1</sub>, . . . , <em>p<sub>n</sub></em>. For example, if the password was 10111010, Henry would get the sequence (0, 1, 0, 3, 0, 1, 1, 0).</p>

<p>Henry would prefer Uncle Markus not to test his algorithmic skills while being dead, but, well, there is no one to complain. And he has good friends who can help him! Given the sequence left by Markus in his will, determine all possible passwords that correspond to it. As the will is battered and stained, it might even happen that there is no solution at all.</p>

### 입력

<p>The first line of input contains the number of test cases <em>z</em> (1 &le; <em>z</em> &le; 200 000). The test cases follow, each one in the following format:</p>

<p>A test case consists of two lines. The first line contains a single integer <em>n</em> &ndash; the length of both the password and Black&rsquo;s sequence (2 &le; <em>n</em> &le; 1 000 000). The second line contains <em>n</em> integers <em>p</em><sub>1</sub>, <em>p</em><sub>2</sub>, . . . , <em>p<sub>n</sub></em>&nbsp;(0 &le; <em>p<sub>i</sub></em>&nbsp;&le; <em>n</em>) &ndash; the palindromic radii for all the characters in the password.</p>

<p>The sum of <em>n</em> values over all test cases does not exceed 5 &middot; 10<sup>7</sup>.</p>

### 출력

<p>For every test case, output first the number <em>k</em> of possible passwords. If <em>k</em> &gt; 0, output in the next <em>k</em> lines all the solutions as {0,1}-sequences. The sequences must be given in lexicographic order.</p>

<p>You may assume that <em>k</em> does not exceed 100.</p>