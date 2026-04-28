# [Gold II] Po - 20960

[문제 링크](https://www.acmicpc.net/problem/20960)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 149, 정답: 79, 맞힌 사람: 69, 정답 비율: 54.331%

### 분류

자료 구조, 스택, 차분 배열 트릭

### 문제 설명

<p>Tinky Winky left a sequence of n zeroes in the Tubbytronic Superdome, and left for a walk with Dipsy. When he came back, he saw that a misdeed has been done. The sequence was changed, and Po was smiling mischeviously in the corner of the room.</p>

<p><em>Oh dear! Po, what have you done?!</em> &ndash; asked Tinky Winky in horror.</p>

<p><em>I enhanced the sequence!</em> &ndash; replied Po.</p>

<p>After cross-examination, it was established that Po did a number of enhancements on the sequence. In every enhancement, she took a <strong>segment</strong> of a sequence and <strong>increased</strong> all elements in the segment by some positive integer. Also, every two segments were either disjoint or one was completely contained in other.</p>

<p><em>How many enhancements have you done, Po?</em> &ndash; Laa-Laa inquired.</p>

<p><em>I really don&rsquo;t know! I&rsquo;m only sure I did the <strong>minimum</strong> number of enhancements possible to get this sequence!</em> &ndash; said Po exhaustedly.</p>

<p><em>Then it surely must be m!</em> &ndash; proclaimed Noo-Noo. (Noo-Noo is the Teletubies&rsquo; vacuum cleaner pet)</p>

<p>What number did Noo-Noo say?</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 100 000), the length of the sequence.</p>

<p>The second line contains n nonnegative integers a<sub>i</sub> (0 &le; a<sub>i</sub> &le; 10<sup>9</sup>), the sequence after Po&rsquo;s enhancements.</p>

### 출력

<p>Output m, the minimum possible number of enhancements.</p>