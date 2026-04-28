# [Platinum III] Prefix Free Code - 16044

[문제 링크](https://www.acmicpc.net/problem/16044)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 22, 맞힌 사람: 21, 정답 비율: 50.000%

### 분류

수학, 자료 구조, 문자열, 트리, 정수론, 세그먼트 트리, 조합론, 모듈로 곱셈 역원, 트라이

### 문제 설명

<p>Consider n initial strings of lower case letters, where no initial string is a prefix of any other initial string. Now, consider choosing k of the strings (no string more than once), and concatenating them together. You can make this many such composite strings:</p>

<p style="text-align: center;">n &times; (n &minus; 1) &times; (n &minus; 2) &times; . . . &times; (n &minus; k + 1)</p>

<p>Consider sorting all of the composite strings you can get via this process in alphabetical order. You are given a test composite string, which is guaranteed to belong on this list. Find the position of this test composite string in the alphabetized list of all composite strings, modulo 10<sup>9</sup> + 7. The first composite string in the list is at position 1</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will begin with a line with two integers, first n and then k (1 &le; k &le; n), where n is the number of initial strings, and k is the number of initial strings you choose to form composite strings. The upper bounds of n and k are limited by the constraints o&nbsp;&nbsp;the strings, in the following paragraphs.</p>

<p>Each of the next n lines will contain a string, which will consist of one or more lower case letters a..z. These are the n initial strings. It is guaranteed that none of the initial strings will be a prefix of any other of the initial strings.</p>

<p>Finally, the last line will contain another string, consisting of only lower case letters a..z. This is the test composite string, the position of which in the sorted list you must find. This test composite string is guaranteed to be a concatenation of k unique initial strings.</p>

<p>The sum of the lengths of all input strings, including the test string, will not exceed 10<sup>6</sup> letters.</p>

### 출력

<p>Output a single integer, which is the position in the list of sorted composite strings where the test composite string occurs. Output this number modulo 10<sup>9</sup> + 7.</p>