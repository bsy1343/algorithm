# [Gold V] Word Clouds Revisited - 11539

[문제 링크](https://www.acmicpc.net/problem/11539)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 25, 정답: 21, 맞힌 사람: 21, 정답 비율: 95.455%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>When we last visited with Tagg Johnson, he was developing software to create images known as word clouds. Although we will not consider all the details, a word cloud provides a visual representation of textual data in which the size of the bounding box for each word depends on the relative frequency of that word in the original text.</p>

<p>Tagg was surprised to stumble upon an oddity involving his algorithm for laying out words in rows. A maximum width is specified for the size of a word cloud, and Tagg&rsquo;s desire is to place the entries into the cloud in a way that minimizes the overall height. Entries must be placed in a predetermined order, with each subsequent entry either placed horizontally to the right of the previous entry, or else to the far left of a new row. The height of each row is equal to the maximum height of all entries placed in that row, and the overall height of the cloud is equal to the sum of the row heights.</p>

<p>Because his goal is to minimize the height, Tagg&rsquo;s original algorithm would place each entry in the same row as the previous entry, unless it did not physically fit because of the given limit on the width of the cloud. As an example, Figure I.1 shows the layout Tagg&rsquo;s original algorithm produces for a particular cloud with a maximum width of 260 units.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11539.%E2%80%85Word%E2%80%85Clouds%E2%80%85Revisited/0acf0cf1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11539/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:150px; width:321px" /></p>

<p style="text-align: center;">Figure I.1: Tagg&rsquo;s original placement of entries for his word cloud</p>

<p>The first, second, and third entries are placed in the first row (totaling width 238). Then the fourth and fifth entries are placed in a row together (totaling width 193). The sixth entry is by itself on a final row. The overall height of this cloud is 48 + 43 + 23 = 114 units (as the first row has height 48, the second row has height 43, and the third row has height 23).</p>

<p>However, Tagg later realized that an even better cloud was possible for this same data set, as shown in Figure I.2. By placing the first and second entries in the first row, the third and fourth entries in the second row, and the fifth and sixth entries in a third row, the overall height of the cloud is only 23+48+28 = 99 units (while still respecting the overall limit of 260 on the width of the cloud).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11539.%E2%80%85Word%E2%80%85Clouds%E2%80%85Revisited/bbafbbe5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11539/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:130px; width:323px" /></p>

<p style="text-align: center;">Figure I.2: An optimal placement of the entries from Figure I.1</p>

<p>So now Tagg wants to redesign his software so that, given a list of words and a specific maximum width, it builds a word cloud with the minimum height.</p>

### 입력

<p>The first line contains two integers, N and C, where 2 &le; N &le; 5000 is the number of entries to be placed, and 150 &le; C &le; 1000 is the maximum width for the cloud. Following that are N additional lines, each specifying the bounding box for one entry, in the order in which those entries must be laid out in the cloud. The line describing an entry contains two integers w and h, specifying the respective width and height of the entry, such that 10 &le; w &le; 150 and 10 &le; h &le; 150.</p>

### 출력

<p>Output the minimum height that is required for the word cloud under the restrictions given above.</p>