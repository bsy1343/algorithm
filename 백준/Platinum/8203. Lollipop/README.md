# [Platinum III] Lollipop - 8203

[문제 링크](https://www.acmicpc.net/problem/8203)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 300, 정답: 123, 맞힌 사람: 97, 정답 비율: 38.800%

### 분류

수학, 애드 혹, 홀짝성

### 문제 설명

<p>Byteasar runs a confectionery in Byteburg. Strawberry-vanilla flavoured lollipops are the favourite of local children. These lollipops are composed of multiple segments of the same length, each segment of either strawberry or vanilla flavour. The price of the lollipop is the sum of the values of its segments, where a vanilla segment costs one bythaler, while a strawberry segments costs two.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8203.%E2%80%85Lollipop/c0285a69.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8203.%E2%80%85Lollipop/c0285a69.jpg" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8203/1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:118px; width:56px" /><br />
Fig. 1: An exemplary lollipop of five segments, three strawberry flavoured and two vanilla, alternately. The price of this lollipop is 8 bythalers.</p>

<p>Currently Byteasar is left with only one lollipop, though possibly very long. As a salesman, he knows only too well that probably no one will want to buy the whole lollipop. For this reason he thinks of breaking the lollipop at the joints of the segments in order to get a shorter lollipop. Each fragment for sale, of course, must stay in one piece.</p>

<p>Byteasar vast experience of a salesman, as well as his understanding of children psychology, tell him that his young customers will most likely want to spend all their money on a single lollipop. With this in mind, he wonders for which values of k the lollipop he has can be broken down in such a way that as a result one would get, among other pieces, a lollipop worth exactly k bythalers. Naturally, he is interested in the way of breaking the lollipop as well. As this task overwhelms him, he asks you for help.</p>

### 입력

<p>In the first line of the standard input there are two integers n and m (1 &le; n,m &le; 1,000,000), separated by a single space. These denote, respectively, the number of segments of the last lollipop left in store, and the number of values of k to consider. The lollipop&#39;s segments are numbered from 1 to n. The second line gives an n-letter description of the lollipop, consisting of letters T and W, where T denotes a strawberry flavoured segment, while W - vanilla flavoured; the i-th of these letters specifies the flavour of the i-th segment. In the following m lines successive values of k (1 &le; k &le; 2,000,000) to consider are given, one per line.</p>

<p>&nbsp;</p>

### 출력

<p>Your program should print out exactly m lines, giving, one per line, the results for successive values of k, to the standard output. If for a given value of k it is impossible to break the lollipop in such a way that there is a contiguous fragment worth exactly k bythalers, then the word NIE (no in Polish) should be printed. Otherwise, two integers l &nbsp;and r (1 &le; l &le; r &le; n), separated by single spaces, should be printed, such that the fragment of the lollipop composed of the segments numbered from l to r inclusively is worth exactly k bythalers. If there are multiple such pairs, your program is free to choose one arbitrarily.</p>

<p>&nbsp;</p>

### 힌트

<p>The example considers the lollipop from Fig. 1. The segments numbered from 1 to 3 form a TWT lollipop, worth 5 bythalers. Segment number 2 has vanilla flavour and costs 1 bythaler. There is no way of getting a lollipop worth 7 bythalers out of the one given.</p>

<p>&nbsp;</p>