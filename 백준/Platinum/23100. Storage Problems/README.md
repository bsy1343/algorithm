# [Platinum II] Storage Problems - 23100

[문제 링크](https://www.acmicpc.net/problem/23100)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 49, 맞힌 사람: 35, 정답 비율: 60.345%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>The gangsters did a very successful robbery of the city&rsquo;s most famous auction house. Now they are safely at their hideout, where they store the stolen items. Luckily, you managed to place a listening device into their hideout. You also have a personal file on each ganger, which contains a recording of their voice. You will listen carefully to what happens next with hope it will help you with the investigation of the robbery.</p>

<p>Each gangster stole exactly one item, the i-th gangster stole the i-th item. Now each gangster is trying to put his item into the common storage, which can hold a total weight of K. The storage is a small room and the gangsters store their items one by one.</p>

<p>When a gangster tries to put an item into the storage but it does not fit, that is the total weight of the items in the storage would exceed K, he gets angry and throws all the items in the storage out. While doing this, he tells the others that &rdquo;j items are going to trash!&rdquo;, where j is the number of items in the storage at the point he tried to store his item. At this point a fight ensues and no more storing will happen.</p>

<p>As you have a listening device in the gangsters&rsquo; storage, you will hear how much items the gangster throws out. Also, using your personal files, you can tell apart each of the gangster&rsquo;s voices.</p>

<p>Therefore, it would help your investigation greatly if you could know in advance, for all possible values of j and i, how many different subsets of items could be in the storage at the moment when the i-th gangster throws all the j items out. As the number of subsets can be large, output it modulo 167772161.</p>

### 입력

<p>The input consists of two lines. The first line contains two integers N and K (2 &le; N &le; 400, 1 &le; K &le; 400), the number of gangsters and the maximum weight that the storage can hold. The second line contains N integers w<sub>1</sub>, w<sub>2</sub>, &middot; &middot; &middot; , w<sub>N</sub>, such that (1 &le; w<sub>i</sub> &le; K) for each 1 &le; i &le; N. Here wi is the weight of item that the i-th gangster stole.</p>

### 출력

<p>The output consists of N lines, each line containing exactly N &minus; 1 integers. The j-th value on the i-th line contains the number of subsets of items containing exactly j items, such that they fit into the storage but the i-th gangter&rsquo;s item can not be added. Each number is modulo 167772161.</p>