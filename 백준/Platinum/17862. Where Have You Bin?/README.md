# [Platinum III] Where Have You Bin? - 17862

[문제 링크](https://www.acmicpc.net/problem/17862)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Ben Bean owns Ben Bean&rsquo;s Bin Bonanza which offers storage bins to the five big companies in town: a rubber band company, a Mercedes Benz dealership, a bing cherry farm, a bonbon candy store and a bun bakery. Together they store their bands, Benzes, bings, bonbons and buns in Ben&rsquo;s bins.</p>

<p>Ben has n bins altogether arranged in a single row, numbered 1 to n. While not all of the bins may be in use at any given time, Ben finds it useful to keep all the bins for one company contiguous. Thus, when a company needs a new bin or relinquishes one it no longer needs, Ben may need to move items from one bin to another to make sure all of that company&rsquo;s bins stay next to each other. Sometimes Ben has a choice of which bin to move, so he has assigned a cost to each bin equal to the number of items stored in the bin (removing items from a relinquished bin and/or moving items into a new bin are the company&rsquo;s responsibility and do not add to Ben&rsquo;s costs). Obviously when moving bins Ben wants to keep the cost as low as possible.</p>

<p>If a single company has to make changes Ben can usually figure out the cheapest way to move items around, but typically at the end of each business quarter all of the five companies will make additions and deletions of bins as they reassess their product lines. In cases like this, deciding the lowest-cost set of moves is more difficult. Consider the situation in Figure K.1a which shows 6 bins storing items from the five companies labeled A, E, I, O and U. The numbers in parentheses indicate the number of items in that bin (and thus the cost of moving the items from that bin to another). Suppose that at the end of the quarter company U decides it no longer needs bin 6 and company A requests a second bin. One possibility is to move E&rsquo;s items from bin 2 to the empty bin 6 which frees up bin 2 for company A (Figure K.1b)&mdash;the cost of this rearrangement to Ben is 4. The optimal move though is to move U&rsquo;s items from bin 5 to bin 1 and move A&rsquo;s items from bin 1 to bin 5 and giving company A bin 6 (Figure K.1c)&mdash;the cost of this move is 3. Ben could also have moved A&rsquo;s items from bin 1 to bin 6 to achieve the same optimal cost. Notice that in all cases removing the three items from U&rsquo;s bin 6 and adding the seven items to A&rsquo;s second bin does not cost anything to Ben.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a5fecf58-b6f4-4a51-95ee-a624d0a26132/-/preview/" style="width: 626px; height: 71px;" /></p>

<p style="text-align: center;">Figure K.1: Sample Input 1.</p>

### 입력

<p>Input starts with a string of characters of length n (1 &le; n &le; 150) indicating the initial usage of the bins. The characters will all be from the set {A, E, I, O, U, X} indicating either the company using the bin or an empty bin (X). Following this is a row of n integers indicating the number of items in each bin; values at locations corresponding to an empty bin will always be 0 and values at locations corresponding to a company&rsquo;s bin will be positive and &le; 100. Bins for any one company will always be contiguous.</p>

<p>The next line starts with an integer d (0 &le; d &le; n) indicating the number of deletions for this quarter. Following this are d integers. Each integer specifies a bin which is no longer needed by a company. None will ever correspond to an already empty bin. On the final line is a positive-length string of characters indicating&nbsp;the new bins requested. If this string is a single X then no new bins are being requested. Otherwise the characters will all be in the set {A, E, I, O, U}, in no particular order, each character representing a request for a new bin by the corresponding company. There will always be enough bins to handle any set of changes.</p>

### 출력

<p>Output the minimal cost required to satisfy all the bin changes while keeping each company&rsquo;s bins contiguous.</p>