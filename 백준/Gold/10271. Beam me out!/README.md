# [Gold III] Beam me out! - 10271

[문제 링크](https://www.acmicpc.net/problem/10271)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 146, 정답: 31, 맞힌 사람: 29, 정답 비율: 24.576%

### 분류

너비 우선 탐색, 많은 조건 분기, 방향 비순환 그래프, 그래프 이론, 그래프 탐색, 위상 정렬

### 문제 설명

<p>King Remark, first of his name, is a benign ruler and every wrongdoer gets a second chance after repenting his crimes in the Great Maze!</p>

<p>Today&rsquo;s delinquent is a renowned computer scientist, but his fame didn&rsquo;t do him any good after he declined to do research on the so called and soon-to-be-famous Remark&rsquo;s algorithms! Those strange randomized algorithms may run indefinitely long (or even never terminate) and may or may not produce a right answer if terminated.</p>

<p>Handily, the Great Maze got recently a major upgrade with the newest beaming technology which made all doors obsolete: After the delinquent says the magic words &ldquo;I was wrong and will never disappoint king Remark again!&rdquo; he will be immediately beamed to the next room. It will be chosen randomly from a list of possible goal rooms.</p>

<p>The Great Maze consists of n rooms numbered 1 to n. Every detainee starts his quest for pardon in room 1 and hopes to get to the throne room n in which he will receive his pardon. If he ends up in a room, whose list of goal rooms is empty, his tour is over; through he could surely say the magic words again and again &ndash; that would not hurt, but would not help him either.</p>

<p>Great king Remark, as most of the kings, doesn&rsquo;t like surprises and summoned you to answer two questions: Is it guaranteed, that the criminal will get to the throne room and is there a limit of beaming operations after which the game is over for sure.</p>

<p>You know better, than to disappoint the great king with a wrong answer or no answer at all, don&rsquo;t you?</p>

### 입력

<p>The input contains a single test case. It starts with a line consisting of an integer 2 &le; n &le; 50 000 &ndash; the number of rooms in the Great Maze. For each of the rooms 1 to n &minus; 1, two lines will follow representing the corresponding list of the goal rooms (in order 1 to n &minus; 1). Bear in mind, that after reaching the throne room n the quest is over. Thus, the list of the throne room is not a part of the input.</p>

<p>The first of these two lines will contain an integer 0 &le; m &le; n &ndash; the number of goal rooms on the list. The second line will contain a list of m goal rooms or an empty string, if m = 0. Each list will be sorted in strictly ascending order (this implies every number on the list will be unique) and consist from integers between 1 and n, inclusive.</p>

<p>The total number of goal rooms summed over all lists will not exceed 10<sup>6</sup>.</p>

### 출력

<p>For each test case a line consisting of two words:</p>

<ul>
	<li>the first word must be &ldquo;PARDON&rdquo;, if the probability for the prisoner getting to the throne room during his random walk is 100%, or &ldquo;PRISON&rdquo; otherwise.</li>
	<li>the second word must be &ldquo;LIMITED&rdquo;, if a limit for the number of beaming operations exists, or &ldquo;UNLIMITED&rdquo; otherwise.</li>
</ul>