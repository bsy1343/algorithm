# [Gold IV] Zig Zag Nametag - 11230

[문제 링크](https://www.acmicpc.net/problem/11230)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 77, 정답: 41, 맞힌 사람: 33, 정답 비율: 50.769%

### 분류

그리디 알고리즘, 문자열, 애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>When ninjas go to conferences they wear fake nametags. One ninja in particular wants to impress his Sensei. His Sensei chooses a new favorite number every day. The pupil wants to put a name on his nametag that encodes his Sensei&rsquo;s favorite number! This name will consist of only lower case letters. He assigns a value to each letter, based on its position in the alphabet (e.g. a = 1, b = 2, ..., z = 26). Then, he encodes the Sensei&rsquo;s number by adding up the absolute values of the differences of every consecutive pair of letters. For example, the string azxb has the value of:</p>

<p style="text-align:center">|a &minus; z| + |z &minus; x| + |x &minus; b| = |1 &minus; 26| + |26 &minus; 24| + |24 &minus; 2| = 49</p>

<p>The name that the ninja will write on his nametag is the shortest string that encodes to his Sensei&rsquo;s favorite number. If there&rsquo;s more than one string of the shortest length, he&rsquo;ll choose the one that comes first alphabetically. Given the Sensei&rsquo;s favorite number, k, find the string that the ninja should put on his nametag.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each input consists of a single line with a single integer k (1 &le; k &le; 1 000 000), which is the Sensei&rsquo;s favorite number. There will always be a name that encodes to the Sensei&rsquo;s number.</p>

### 출력

<p>Output a single line with a string of lower case letters, which is the name that the ninja should put on the nametag to impress the Sensei.</p>