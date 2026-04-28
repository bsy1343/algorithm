# [Platinum II] Election Frenzy - 15171

[문제 링크](https://www.acmicpc.net/problem/15171)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 14, 맞힌 사람: 12, 정답 비율: 30.000%

### 분류

(분류 없음)

### 문제 설명

<p>Checks and balances are some of the most important parts of any democratic government system. After a long campaign, the election between Phong, from the Sprites Party, and Megabyte, from the Viruses Party, has just finished. The only thing left to do is count the votes and declare a winner</p>

<p>The votes are counted in a room with t tables. At each table, there is a person counting votes. These people are called counters. Members from the two political parties are allowed to be in the room to ensure that the counting is done fairly. These people are called scrutineers. In a perfect system, one scrutineer from each political party would be present at each table. Unfortunately, this is not possible since there is only enough room for one scrutineer per table.</p>

<p>We need your help in deciding how to assign the scrutineers to the tables. Each table must have exactly one scrutineer: from either the Sprites or the Viruses. Some of the tables are close to one another. This means that a scrutineer will be able to monitor the counting at their table and all surrounding tables. An assignment of scrutineers is considered fair if every table is monitored by at least one Sprite and at least one Virus.</p>

<p>The counter at each table was asked to submit a list of all tables that can be seen from their table. For some reason, some of the counters submitted a list of the tables that can be seen from their table and some of the counters submitted a list of tables that cannot be seen from their table.</p>

<p>Given this information, find a fair assignments of scrutineers.</p>

### 입력

<p>The first line of input contains a single integer t (1 &le; t &le; 200 000), which is the number of tables.</p>

<p>The next t lines describe the lists that the counters submitted for each table. Each of these lines starts with a letter p (either C or N), which is the type of the list, and an integer k (0 &le; k &le; t &minus; 1), which is the length of the list. This is followed by k distinct integers a<sub>1</sub>, . . . , a<sub>k</sub> (1 &le; a<sub>i</sub> &le; n), which are the items on the list. If p = C, then each table ai can be monitored by the scrutineer at this table and all other tables cannot be monitored. If p = N, then each table ai cannot be monitored by the scrutineer at this table and all other tables can be monitored. The list does not contain its own table number since the scrutineer can always monitor the table they are sitting at.</p>

<p>The first table in the input is table 1, the second table is table 2, and so on. It is guaranteed that if table x can monitor table y, then table y can monitor table x. The total length of all lists is at most 500 000.</p>

### 출력

<p>Display any fair assignment of scrutineers. The assignment should be described as a string of length t containing only the letters S, for a Sprite scrutineer, and V, for a Virus scrutineer. The first letter of the string is the scrutineer for table 1, the second letter is the scrutineer for table 2, and so on. If there are multiple solutions, display any of them. If there is no such assignment, display Impossible instead.</p>