# [Silver I] A Midsummer Night’s Dream - 13500

[문제 링크](https://www.acmicpc.net/problem/13500)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 20, 맞힌 사람: 12, 정답 비율: 42.857%

### 분류

구현, 기하학, 시뮬레이션

### 문제 설명

<p>In the central of several subplots of the comedy &ldquo;A Midsummer Night&rsquo;s Dream,&rdquo; Helena loves Demetrius, who loves&nbsp;Hermia, who loves (and is loved by) Lysander. When Hermia&rsquo;s father wants to force her to marry Demetrius (on penalty&nbsp;of death), she and Lysander try to escape. Demetrius pursues them, and is in turn pursued by Helena. When the fairies&nbsp;&mdash; who have their own little bit of drama &mdash; learn about this sordid state of affairs, they decide to divert some of the love&nbsp;potion intended for their own little shenanigans to fix the humans&rsquo; problems. The love potion, applied to the eyelids of a&nbsp;sleeping person, will make them fall in love with the first person/animal they see upon waking up. Unfortunately, Puck&nbsp;(the sprite in charge of administering the potion) does not know the humans yet, and applies the potion to the wrong&nbsp;person. Hijinks ensues. Here, you are to find out how many actual couples (mutual being in love) result from Puck&rsquo;s&nbsp;mistakes with the love potion.</p>

<p>You will be given, for each person, where they are at various times (integer coordinates), and when &mdash; if at all &mdash; the&nbsp;love potion was applied to them. You will also be told how far people can see; they will fall in love with the first person&nbsp;within that range after application of the potion (possibly no one, if no one comes close enough). Notice that if a person&nbsp;u appears in the range of v when Puck is applying the potion to v, u can be a candidate of &ldquo;first&rdquo; people of v. If there are&nbsp;multiple &ldquo;first&rdquo; people, they will fall in love with the closest. We will ensure that there is never a situation where there&nbsp;are two first people who are equally close.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets&nbsp;of the following form:</p>

<p>The first line of a data set contains two integers n, d. 1 &le; n &le; 100 is the number of people, and 0 &le; d &le; 100 is the distance&nbsp;people can see.</p>

<p>This is followed by the description of the n people. For each person i, you first have a line with two integers p<sub>i</sub>, m<sub>i</sub>.&nbsp;&minus;1 &le; p<sub>i</sub> &le; 10<sup>4</sup>&nbsp;is the time when the potion is applied to person i; &minus;1 represents that no potion is applied to i. 0 &le; m<sub>i</sub> &le; 100&nbsp;is the number of distinct locations at which i was seen.&nbsp;This is followed by a line with m<sub>i</sub> triples of integers x<sub>i,j</sub> , y<sub>i,j</sub> , t<sub>i,j</sub> .&nbsp;&minus;1000 &le; x<sub>i,j</sub> , y<sub>i,j</sub> &le; 1000 are the coordinates where i was seen for the jth&nbsp;time, and t<sub>i,j </sub>&le; 10<sup>4</sup>&nbsp;is the time when this jth&nbsp;observation of i was made. For each person i, these triples will be sorted by increasing t<sub>i,j</sub> . The interpretation is that&nbsp;person i is at the location t<sub>i,j</sub> until the next sighting at time t<sub>i,j+1</sub> or until time is over. Before the first sighting of person&nbsp;i, the person is somewhere far away. We will guarantee that all times (potion applications and appearance of people) will&nbsp;be distinct.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on a line by itself, output the number of couples, i.e., pairs of people mutually in love with each other.</p>

<p>Each data set should be followed by a blank line.</p>