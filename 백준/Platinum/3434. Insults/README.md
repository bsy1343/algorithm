# [Platinum III] Insults - 3434

[문제 링크](https://www.acmicpc.net/problem/3434)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 13, 맞힌 사람: 12, 정답 비율: 46.154%

### 분류

많은 조건 분기, 자료 구조, 구현, 스택, 문자열

### 문제 설명

<p>Insulting your friends and neighbors is the Ardenia national sport. However, as every sport, it has a certain set of rules which are quite hard to learn even by natives, not to mention the tourists. First of all, the insults are single words consisting entirely of four vowels: a, e, i, and o. But not all words that consist of these letters are insults. The only two letter insults are ae and io. If words w<sub>1</sub> and w<sub>2</sub> are insults, then words w<sub>1</sub>w<sub>2</sub> and aw<sub>1</sub>e and iw<sub>1</sub>o are insults as well. Insults are created only in such way.</p>

<p>Usually, if somebody is insulting you, then you better have a sharp response insult prepared. Obviously, most of the answers are inappropriate. For example if you hear aaeeio (meaning you fight like a dairy farmer) you should not reply with aeio (you are stupid). To everybody&rsquo;s surprise, the linguists have found out that in all the cases the most appropriate reply is the insult of the same length and alphabetically next. Thus, for the insult above, the best reply would be aaeioe (how appropriate; you fight like a cow). This rule implies also the existence of so called ultimate insults, i.e., the ones for which there is no good reply. The eight letter ultimate insult is ioioioio (your mother was a hamster and your father smelt of elderberries).</p>

<p>The input contains several test cases. The first line of the input contains a positive integer Z &le; 2000, denoting the number of test cases. Then Z test cases follow, each conforming to the format described in section Input. For each test case, your program has to write an output conforming to the format described in section Output.</p>

### 입력

<p>The input instance is one line containing a string of length at most 10<sup>6</sup>. The only letters occurring in the string will be a, e, i and o.</p>

### 출력

<p>You should output a single line containing the word INVALID if the string is not an insult. Otherwise, you should output the best reply to the insult read or word ULTIMATE if no such reply exists.</p>