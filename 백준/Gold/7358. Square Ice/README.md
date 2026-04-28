# [Gold III] Square Ice - 7358

[문제 링크](https://www.acmicpc.net/problem/7358)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 16, 맞힌 사람: 14, 정답 비율: 70.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Square Ice is a two-dimensional arrangement of water molecules H2O, with oxygen at the vertices of a square lattice and one hydrogen atom between each pair of adjacent oxygen atoms. The hydrogen atoms must stick out on the left and right sides but are not allowed to stick out the top or bottom. One 5&times;5 example is shown below.</p>

<pre>
                              H-O H-O-H O-H O-H O-H
                                |       |   |   |
                                H   H   H   H   H
                                    |
                              H-O-H O H-O H-O-H O-H
                                    |   |       |
                                H   H   H   H   H
                                |           |
                              H-O H-O-H O-H O H-O-H
                                        |   |
                                H   H   H   H   H
                                |   |           |
                              H-O H-O H-O H-O-H O-H
                                        |
                                H   H   H   H   H
                                |   |   |   |
                              H-O H-O H-O-H O-H O-H
</pre>

<p>Note that each hydrogen atom is attached to exactly one of its neighboring oxygen atoms and each oxygen atom is attached to two of its neighboring hydrogen atoms. (Recall that one water molecule is a unit of one O linked to two H&#39;s.)</p>

<p>It turns out we can encode a square ice pattern with what is known as an alternating sign matrix (ASM): horizontal molecules are encoded as 1, vertical molecules are encoded as -1 and all other molecules are encoded as 0. So, the above pattern would be encoded as:</p>

<pre>
                              0  1  0  0  0
                              1 -1  0  1  0
                              0  1  0 -1  1
                              0  0  0  1  0
                              0  0  1  0  0
</pre>

<p>An ASM is a square matrix with entries 0, 1 and -1, where the sum of each row and column is 1 and the non-zero entries in each row and in each column must alternate in sign. (It turns out there is a one-to-one correspondence between ASM&#39;s and square ice patterns!)</p>

<p>Your job is to display the square ice pattern, in the same format as the example above, for a given ASM. Use dashes (-) for horizontal attachments and vertical bars (|) for vertical attachments. The pattern should be surrounded with a border of asterisks (*), be left justified and there should be exactly one character between neighboring hydrogen atoms (H) and oxygen atoms (O): either a space, a dash or a vertical bar.</p>

### 입력

<p>Input consists of multiple cases. Each case consists of a positive integer m (&le; 11) on a line followed by m lines giving the entries of an ASM. Each line gives a row of the ASM with entries separated by a single space. The end of input is indicated by a line containing m = 0.</p>

<p>&nbsp;</p>

### 출력

<p>For each case, print the case number (starting from 1), in the format shown in the Sample Output, followed by a blank line, followed by the corresponding square ice pattern in the format described above. Separate the output of different cases by a blank line.</p>