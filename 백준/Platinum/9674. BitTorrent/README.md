# [Platinum V] BitTorrent - 9674

[문제 링크](https://www.acmicpc.net/problem/9674)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 7, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The BitTorrent is a protocol for transferring large files running over a peer-to-peer network in which nodes act as both clients and servers, in contrast to the centralized client&ndash;server architecture where client nodes request central servers to get resources. Indeed, the protocol allows users to establish a group of hosts to download and upload files from each other simultaneously. Precisely, the whole package of files (so-called torrent) is segmented into pieces as depicted in the figure. For instance, a 10 MB package might be segmented into exactly ten 1M-size pieces or exactly forty 256KB-size pieces. As each host (or peer) receives a new piece of the torrent it becomes a source of that piece for other hosts willing to have that piece. Pieces are typically downloaded nonsequentially and are rearranged into the correct order by hosts. Each host independently manages which pieces must be downloaded. Pieces are of the same size throughout a single torrent download except the last piece which may have a smaller size.</p>

<p>You want to download a package of files, but you are approaching your monthly Internet usage limit and you don&rsquo;t want to wait till the next month. You want to download the maximum number of files with the bandwidth left. Which pieces must be downloaded?</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9674.%E2%80%85BitTorrent/294cb7a6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9674.%E2%80%85BitTorrent/294cb7a6.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9674/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%203.38.16.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:71px; width:370px" /></p>

### 입력

<p>The input contains multiple test cases. Each test case starts with three space-separated integers N, P, and L where N is the number of files in the torrent (1 &le; N &le; 3000), P is the size of pieces in KB (1 &le; P &le; 1000), and L is the remaining kilobytes from your monthly Internet usage limit (1 &le; L &le; 10<sup>6</sup>). The second line of a test case contains N space-separated positive integers not exceeding 100,000 where the i<sup>th</sup> integer is the size (in KB) of the i<sup>th</sup> file in the torrent. The input terminates with &ldquo;0 0 0&rdquo; which should not be processed.</p>

### 출력

<p>For each test case, output a line containing the maximum number of files which can be downloaded from the torrent.&nbsp;</p>