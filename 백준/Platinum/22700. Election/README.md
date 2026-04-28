# [Platinum IV] Election - 22700

[문제 링크](https://www.acmicpc.net/problem/22700)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 1, 맞힌 사람: 1, 정답 비율: 20.000%

### 분류

구현, 자료 구조, 정렬

### 문제 설명

<p>Giselle has just made a vote for a national election. In her country, members of the legislature are elected by a system called mixed member proportional representation (MMP). Basically, half the members are elected from constituencies, and the other half are elected from party lists by proportional representation. Each voter has two votes, one for a constituency representative and one for a party.</p>

<p>In each constituency, the representative is chosen by a single-winner voting system called the first-past- the-post. This system is very simple: the candidate who earns the highest number of votes wins the seat. There are constituencies equal to half the number of seats, and they are determined in accordance with geographical areas.</p>

<p>Each party is allocated the seats according to the percentage of votes cast for that party. Only parties that have either at least five percent of the total party votes or at least three constituency seats are eligible for the seats; the parties that satisfy neither of these prerequisites are excluded on the following procedure. The number of seats for each eligible party is determined based on the value given by:</p>

<p style="text-align: center;">(the number of overall seats) &times; ((the number of votes cast for that party) / (the total number of votes cast for all eligible parties)).</p>

<p>Note that the multiplier in the above formula is the number of&nbsp;<i>overall</i>&nbsp;seats, not party-list seats (i.e. not half the members). Each party receives the seats equal to the integer part of this value. There usually remain some seats, and they are allocated to the parties in decreasing order of the fraction parts, where each party receive at most one extra seat. If two or more parties have the same fraction parts, the party that gained a greater number of votes gets higher preference.</p>

<p>The number of seats allocated by the above procedure counts both the constituency seats and the party- list seats. Each party is therefore entitled to add members from the list just as many as the number of its allocated seats minus the number of its constituency seats. Those members are chosen in the order predetermined by the party. If some candidates in the party list already have the seats for constituency representatives (this happens because each constituency candidate is allowed to also be included in the list), they are not counted and the next candidates down are added instead.</p>

<p>The candidates who won in constituencies never forfeit their seats. It sometimes happens that the number of constituencies where a party won exceeds the number of seats allocated for the party vote. In this case,&nbsp;<i>all</i>&nbsp;winners in constituencies receive the seats in the legislature, although no more members will be elected from the party list. The same still applies to the candidates in the parties ineligible to be allocated the seats. Note that this raises the total number of seats. The seats added for this reason are called&nbsp;<i>overhang seats</i>.</p>

<p>Now, let us take an example. Suppose three parties A, B, and C are competing for eight seats, where the party A has earned one constituency seat and 9,000 party votes, the party B one and 8,000, and the party C two and 3,000. The total number of party votes is 9000 + 8000 + 3000 = 20000, thus the five-percent threshold is 20000 &times; (5/100) = 1000. From this threshold, all parties are eligible to be allocated the seats. The formula gives (8 &times; 9000)/20000 = 3.6, (8 &times; 8000)/20000 = 3.2, and (8 &times; 3000)/20000 = 1.2, so the parties A, B, and C receive three seats, three, and one respectively. There is one remaining seat, and it goes to the party A for the largest fraction part 0.6 ( = 3.6 &minus; 3). In conclusion, the party A gains four seats in total, and since this party won one constituency seat, there are three more members to be chosen from the party A&rsquo;s list. Similarly, there are two more members from the party B&rsquo;s list. On the other hand, the party C receives only one seat despite winning in two constituencies. So no members will be chosen from the party C&rsquo;s list and one overhang seat occurs. The total number of elected members therefore will be nine. This example corresponds to the first case of the sample input and output.</p>

<p>You are required to write a program that determines which candidates win the seats.</p>

### 입력

<p>The input consists of multiple data sets. Each data set has the following format:</p>

<pre>
<i>N M</i>
<i>Party</i><sub>1</sub>
<i>Party</i><sub>2</sub>
...
<i>Party</i><sub><i>M</i></sub>
<i>Constituency</i><sub>1</sub>
<i>Constituency</i><sub>2</sub>
...
<i>Constituency</i><sub><i>N</i>/2</sub>
</pre>

<p><i>N</i>&nbsp;is a positive even integer that represents the number of seats.&nbsp;<i>M</i>&nbsp;is a positive integer that represents the number of parties.&nbsp;<i>Party<sub>i</sub></i>&nbsp;is the description of the&nbsp;<i>i</i>-th party.&nbsp;<i>Constituency<sub>i</sub></i>&nbsp;is the description of the&nbsp;<i>i</i>-th constituency.</p>

<p>Each party description is given in the following format:</p>

<pre>
<i>PartyName C V</i>
<i>Name</i><sub>1</sub>
<i>Name</i><sub>2</sub>
...
<i>Name</i><sub><i>C</i></sub>
</pre>

<p><i>PartyName</i>&nbsp;is the name of the party.&nbsp;<i>C</i>&nbsp;is a positive integer that represents the number of candidates in the party list.&nbsp;<i>V</i>&nbsp;is a non-negative integer that represents the number of votes cast for that party.&nbsp;<i>Name<sub>i</sub></i>&nbsp;is the name of the candidate with the&nbsp;<i>i</i>-th highest priority in the party list.</p>

<p>Each constituency description is given in the following format:</p>

<pre>
<i>C</i>
<i>Name</i><sub>1</sub> <i>Party</i><sub>1</sub> <i>V</i><sub>1</sub>
<i>Name</i><sub>2</sub> <i>Party</i><sub>2</sub> <i>V</i><sub>2</sub>
...
<i>Name</i><sub><i>C</i></sub> <i>Party</i><sub><i>C</i></sub> <i>V</i><sub><i>C</i></sub>
</pre>

<p><i>C</i>&nbsp;is a positive integer, equal to or greater than two, that represents the number of candidates in the constituency.&nbsp;<i>Name<sub>i</sub></i>&nbsp;is the name of the&nbsp;<i>i</i>-th candidate in the constituency.&nbsp;<i>Party<sub>i</sub></i>&nbsp;is the name of the party that the&nbsp;<i>i</i>-th candidate belongs.&nbsp;<i>V<sub>i</sub></i>&nbsp;is a non-negative integer that represents the number of votes cast for the&nbsp;<i>i</i>-th candidate.</p>

<p>The input is terminated with a line that contains two zeros. This line should not be processed.</p>

<p>You may assume all the followings:</p>

<ul>
	<li>The name of each party is a string up to ten characters that begins with an uppercase character and consists of only uppercase and numeric characters. The name of each candidate is a string up to twenty characters that begins with a lowercase character and consists of only lowercase and numeric characters. No multiple parties or candidates have the same name.</li>
	<li>The number of parties, the number of seats, and the total number of different candidates do not exceed 20, 200, and 1,000 respectively. Neither the total number of party votes nor the total number of votes in each constituency exceeds 10,000,000.</li>
	<li>No two or more parties receive the same number of party votes. Also, in each constituency, no two or more candidates receive the same number of constituency votes.</li>
	<li>Each party list contains enough candidates, that is, the party can always choose the required number of candidates from the list.</li>
	<li>Every candidate belongs to just one of the parties. No candidate is allowed to compete in more than one constituency. Note that, however, each candidate may appear up to twice in a data set, one in a party list and one in a constituency description.</li>
	<li>The number of data sets in the input does not exceed fifty.</li>
</ul>

### 출력

<p>For each data set, print names of all elected persons, one name per line, in lexicographical order according to the ASCII code. Print an empty line between two consecutive data sets.</p>