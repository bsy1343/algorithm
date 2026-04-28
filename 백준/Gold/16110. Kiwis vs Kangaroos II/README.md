# [Gold II] Kiwis vs Kangaroos II - 16110

[문제 링크](https://www.acmicpc.net/problem/16110)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 14, 맞힌 사람: 12, 정답 비율: 50.000%

### 분류

해 구성하기

### 문제 설명

<p>Last year&rsquo;s feud between the Kiwis and the Kangaroos is still ongoing. Somehow, the word game did not seem to squash the rivalry that has formed between them! Again, they have turned to you to settle this.</p>

<p>You have decided that you will hold a head-to-head programming tournament. Each country, Australia and New Zealand, will send some number of programmers (not necessarily the same number) to compete in the tournament. The programmers from Australia are called &lsquo;kangaroos&rsquo;, and the programmers from New Zealand are called &lsquo;kiwis&rsquo;. You have set up n stadiums to hold the tournament. The tournament will take place in n separate rounds.</p>

<p>In each round, n different kangaroos will battle against n different kiwis, with one kangaroo battling one kiwi in each stadium (n battles per round, so n<sup>2</sup> battles in total). To keep things interesting for the spectators, no programmer may battle in any given stadium more than once, though they may battle against the same opponent multiple times in different rounds.</p>

<p>The king of the kangaroos has nominated m kangaroos. The ith kangaroo must fight in exactly t<sub>i</sub> different battles. Similarly, the queen of the kiwis has nominated k kiwis. The ith kiwi must fight in exactly s<sub>i</sub> battles.</p>

<p>Find a valid tournament schedule that satisfies the above constraints.</p>

### 입력

<p>The first line of input contains three integers n (1 &le; n &le; 200), which is the number of stadiums and rounds, m (n &le; m &le; n<sup>2</sup>), which is the number of kangaroos, and k (n &le; k &le; n<sup>2</sup>), which is the number of kiwis. The second line contains m integers t<sub>1</sub>, . . . , t<sub>m</sub> (1 &le; t<sub>i</sub> &le; n), which are the number of battles each of the kangaroos should compete in. The third line contains k integers s<sub>1</sub>, . . . , s<sub>k</sub> (1 &le; s<sub>i</sub> &le; n), which are the number of battles each of the kiwis should compete in. It is guaranteed that t<sub>1</sub> + &middot; &middot; &middot; + t<sub>m</sub> = n<sup>2</sup> and s<sub>1</sub> + &middot; &middot; &middot; + s<sub>k</sub> = n<sup>2</sup>.</p>

### 출력

<p>Display a valid schedule.</p>

<p>The schedule should be displayed over n lines. The ith line is the schedule for round i. Each line must contain n battles. Each battle must be of the form avb, where a is the kangaroo in the battle and b is the kiwi in the battle (v is just the character &lsquo;v&rsquo;). The kangaroos are numbered 1, . . . , m and the kiwis are numbered 1, . . . , k. The first battle listed on each line is the battle in stadium 1, the second battle listed on each line is the battle in stadium 2, and so on. See the sample output for clarity.</p>

<p>If there are multiple solutions, any one will be considered correct. It is guaranteed that at least one valid schedule exists.</p>