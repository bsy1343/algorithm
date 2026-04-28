# [Gold III] 인물이와 정수 - 20666

[문제 링크](https://www.acmicpc.net/problem/20666)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 928, 정답: 272, 맞힌 사람: 214, 정답 비율: 29.847%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>인물이와&nbsp;정수는&nbsp;친한&nbsp;친구이다. 어느 날&nbsp;인물이가&nbsp;하는&nbsp;게임에&nbsp;관심이&nbsp;생긴&nbsp;정수는&nbsp;게임에&nbsp;대해&nbsp;이것저것&nbsp;물어보았다.</p>

<p>게임에는&nbsp;<em>N</em>마리의&nbsp;몬스터가&nbsp;있고,&nbsp;<em>M</em>마리의&nbsp;몬스터를&nbsp;잡으면&nbsp;이&nbsp;게임을&nbsp;클리어하게&nbsp;된다. 몬스터는&nbsp;한&nbsp;번에&nbsp;하나씩만&nbsp;잡을&nbsp;수&nbsp;있다.</p>

<p>각각의&nbsp;몬스터를&nbsp;잡으면&nbsp;그&nbsp;몬스터가&nbsp;주는&nbsp;아이템을&nbsp;얻을&nbsp;수&nbsp;있다. 즉&nbsp;a번&nbsp;몬스터를&nbsp;잡으면&nbsp;a번&nbsp;아이템을&nbsp;얻을&nbsp;수&nbsp;있고,&nbsp;a번&nbsp;아이템을&nbsp;다른&nbsp;경로로&nbsp;얻을&nbsp;수&nbsp;있는&nbsp;방법은&nbsp;없다.</p>

<p>게임을&nbsp;많이&nbsp;했던&nbsp;인물이는&nbsp;각&nbsp;몬스터들을&nbsp;한 번씩&nbsp;잡아서&nbsp;모든&nbsp;아이템을&nbsp;갖고&nbsp;있다. 그래서&nbsp;인물이는&nbsp;각&nbsp;몬스터의&nbsp;난이도가 <em>C<sub>i</sub></em>라고&nbsp;했지만,&nbsp;정수는&nbsp;게임을&nbsp;처음&nbsp;해서&nbsp;아이템이&nbsp;없기&nbsp;때문에&nbsp;그보다&nbsp;더&nbsp;어려워질&nbsp;수&nbsp;있다.</p>

<p>인물이는&nbsp;정수에게&nbsp;권장&nbsp;아이템에&nbsp;관한&nbsp;팁&nbsp;<em>p</em>개를&nbsp;알려주었다.&nbsp;팁은&nbsp;<em>a,&nbsp;b,&nbsp;t</em>의&nbsp;형태를&nbsp;갖고&nbsp;있고,&nbsp;<em>a</em>&nbsp;아이템&nbsp;없이&nbsp;<em>b</em>&nbsp;몬스터를&nbsp;잡을&nbsp;경우&nbsp;<em>t</em>&nbsp;만큼&nbsp;어려워진다는&nbsp;것을&nbsp;말한다.</p>

<p>정수는&nbsp;게임을&nbsp;하면서&nbsp;만나는&nbsp;몬스터의&nbsp;최대&nbsp;난이도를&nbsp;이&nbsp;게임의&nbsp;난이도라고&nbsp;생각한다. 인물이는&nbsp;정수가&nbsp;게임을&nbsp;너무&nbsp;어렵게&nbsp;느끼지&nbsp;않도록&nbsp;몬스터를&nbsp;잡는&nbsp;순서를&nbsp;잘&nbsp;정해주었다. 정수가&nbsp;게임을&nbsp;클리어할&nbsp;때&nbsp;느끼는&nbsp;난이도를&nbsp;최대한&nbsp;줄여보자.</p>

### 입력

<p>첫 번째&nbsp;줄에 두 정수 <em>N</em>,<em> M&nbsp;</em>이 공백으로 구분되어&nbsp;주어진다. (1 &le;&nbsp;<em>N</em>&nbsp;&le; 100,000, 1 &le;&nbsp;<em>M</em>&nbsp;&le;&nbsp;<em>N</em>)</p>

<p>두 번째 줄에 <em>N</em> 개의 정수 <em>C<sub>1</sub>, C<sub>2</sub>, ... , C<sub>N</sub></em>&nbsp;가 공백으로 구분되어 주어진다. <em>C<sub>i&nbsp;</sub></em>는 인물이에게&nbsp;<em>i</em>&nbsp;번째 몬스터의 난이도를 말한다. (1 &le; <i>C<sub>i</sub></i>&nbsp;&le; 1,000,000,000)</p>

<p>세 번째 줄에 정수가 받은&nbsp;팁의 개수 <em>p</em>&nbsp;가 주어진다. (0 &le; <i>p</i>&nbsp;&le; 300,000)</p>

<p>다음 <i>p</i>&nbsp;줄에 걸쳐 <em>a, b, t</em> 가 주어진다. <em>a</em> 아이템이 없어 <em>b</em> 몬스터를 잡을 때 <em>t</em> 만큼 난이도가 올라가게 된다. (1 &le; <i>a, b</i>&nbsp;&le; <em>N</em>, 1 &le; <em>t</em> &le; 1,000,000,000)</p>

<p>두 팁의 a, b가 같은 경우는 주어지지 않는다.</p>

### 출력

<p>정수가 게임을 클리어할 때 느끼는 난이도의 최소값을 출력한다.</p>