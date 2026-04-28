# [Gold V] Bot Or Not - 14775

[문제 링크](https://www.acmicpc.net/problem/14775)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 7, 맞힌 사람: 6, 정답 비율: 37.500%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Fake news items are often spread by bots on Twitter and related sites. Fake news bots often try to be mistaken for a human, so that their endorsements of (often fake) news stories can generate traffic for the fake news site. In order to look like human users, bots follow individuals and repost their stories. Twitter would really like to be able to identify and remove such bots. In this problem, you will identify bots by using the fact that the posting patterns of bots differ from those of known humans.</p>

<p>You will be given some &ldquo;primary&rdquo; accounts that post stuff, and &ldquo;secondary&rdquo; accounts that repost stuff from the primary accounts. For each secondary account, you will be given which primary accounts it follows, as well as whether it is known to be human or unknown. You will also be given a list of all posts that it reposts. The assumption is that each secondary account sees all posts by all primary accounts it follows; so if it does not repost a post, this is a conscious (or bot-ish) decision.</p>

<p>We assume that human reposting patterns are somewhat similar, and bot patterns are different. Specifically, you will be given three integer numbers w<sub>0</sub>, w<sub>1</sub>, w<sub>2</sub> with w<sub>1</sub> &lt; 0 &lt; w<sub>0</sub>, w<sub>2</sub>. w<sub>j</sub> is the similarity score between two accounts if j of them repost a particular post. So if they agree (both of them repost, or neither of them does), they get a positive match score; if they disagree, they get a negative match score w<sub>1</sub>. We say that two accounts are &ldquo;similar&rdquo; if their total match score exceeds a given threshold t. We judge an account as human if it is similar to a known human account; note that being similar to an account that is similar to a known human does not make the account judged as human.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of the data set contains six integers p, s, w<sub>0</sub>, w<sub>1</sub>, w<sub>2</sub>, t. 1 &le; p &le; 100 is the number of primary accounts, and 1 &le; s &le; 100 the number of secondary accounts. &minus;100 &le; w<sub>1</sub> &lt; 0 &lt; w<sub>0</sub>, w<sub>2</sub> &le; 100 are the similarity scores, and 0 &le; t &lt; 100000 is the similarity threshold.</p>

<p>This is followed by a line with p integers 0 &le; m<sub>i</sub> &le; 1000; m<sub>i</sub> is the number of posts that primary account i made. The posts are numbered so that the first m<sub>1</sub> posts come from account 1, the next m<sub>2</sub> posts from account 2, etc.</p>

<p>Next come s lines, each describing a secondary account j. Each line first contains an integer h<sub>j</sub> which is either 0 (not known if human or bot) or 1 (known to be human). Next is an integer 0 &le; f<sub>j</sub> &le; p, the number of primary accounts that j follows. This is followed by f<sub>j</sub> distinct integers between 1 and p, the indices of the primary accounts that j follows. Next is an integer 0 &le; r<sub>j</sub> &le; &Sigma;<sub>i</sub>m<sub>i</sub> , the number of reposts made by account j. This is followed by r<sub>j</sub> distinct integers between 1 and &Sigma;<sub>i</sub>m<sub>i</sub> , the posts that account j reposted. Our input will never have j reposting posts by an account that he/she/it isn&rsquo;t following.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the number of secondary accounts that are judged (or known) to be human.</p>

<p>Each data set should be followed by a blank line.</p>