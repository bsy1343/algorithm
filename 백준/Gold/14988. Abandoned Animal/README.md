# [Gold IV] Abandoned Animal - 14988

[문제 링크](https://www.acmicpc.net/problem/14988)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 33, 맞힌 사람: 31, 정답 비율: 64.583%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 스택, 큐

### 문제 설명

<p>Your little sister has been a big help today: she went into town to do all the groceries! During this grand voyage, she was accompanied by her fluffy friend, Mr. Fluffynose the Stuffed Animal. However, after her return, it seems that she has left him somewhere along the route! This is devastating news for your little sister, and as she won&rsquo;t stop crying about it, you decide to retrace her steps through town.</p>

<p>You know that your sister will hold on to her beloved Fluffynose whenever possible, so the only time she could&rsquo;ve lost it is when she grabbed an item on her shopping list. So, all you have to do is figure out at what store she bought what, and then you&rsquo;ll reunite her with her counterpart in no time! However, you soon find out that this isn&rsquo;t quite as easy as you thought: she went to a lot of stores, and although she knows the names of the stores she went to and the order in which she visited them, she does not recall what she bought at each store (it could have been nothing!). It would take a lot of time to blindly search all the stores for all these items. As you have better things to do today, like solving programming problems, you want to spend as little time on this retrieval as possible. Therefore, you want to know exactly which items your sister bought at each store before you start your search.</p>

<p>For this you have two pieces of information: firstly you know the inventory of all stores your sister went to. Secondly, you know exactly in what order she purchased the groceries, as she has very carefully stacked all items into her bag. You decide to number the stores your sister visited according to the order in which she visited them. Given this information, you want to decide whether you know for sure where she bought every item so you can retrace her steps as efficiently as possible.</p>

### 입력

<p>The input starts with a line with a single integer 1 &le; N &le; 100,000, the number of supermarkets in town. Then follows a line with an integer N &le; K &le; 100,000, after which K lines follow with a space-separated integer i (between 0 and N &minus; 1) and a string S (consisting of only lowercase letters, at most 10), denoting that item S is available at the i th store that your sister visited. It is guaranteed that every store has at least one item, every item is available at at least one store, and that every item occurs at most once at every store.</p>

<p>The second part of the input contains the list of items your sister bought, in order of purchase. It starts with a line with an integer M &le; K, the number of items your sister has bought. Then follow M lines, each with string T, denoting the name of the item your sister bought. The items are given in the order she purchased them in. All items that your sister has bought are unique.</p>

### 출력

<p>Output &ldquo;impossible&rdquo; if there is no path through the stores that matches your sister&rsquo;s&nbsp;description. Output &ldquo;unique&rdquo; if there is exactly one path through the stores that matches. Output &ldquo;ambiguous&rdquo; if there are multiple possible paths.</p>