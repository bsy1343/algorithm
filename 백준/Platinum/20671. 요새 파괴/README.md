# [Platinum II] 요새 파괴 - 20671

[문제 링크](https://www.acmicpc.net/problem/20671)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 247, 정답: 53, 맞힌 사람: 40, 정답 비율: 20.101%

### 분류

이분 탐색, 자료 구조, 분리 집합

### 문제 설명

<p><em>N</em>개의&nbsp;블럭들이&nbsp;쌓여&nbsp;요새를&nbsp;만든다.&nbsp;각각의&nbsp;블럭은 서로 겹치지 않게&nbsp;<em>H</em>층에서 <em>L</em>칸에서 <em>R</em>칸까지의 구간을&nbsp;차지한다. 1층의 블럭을 제외한 다른 블럭들은 항상 아래층에 어떤 블럭이 존재한다. 이때 위에&nbsp;쌓여&nbsp;있는&nbsp;블럭은&nbsp;아래에&nbsp;있는&nbsp;블럭의&nbsp;구간&nbsp;안에&nbsp;전부&nbsp;포함된다. 즉, 임의의 i 번 블럭의 위에 쌓이는 모든 j번 블럭에 대해서 <em>L<sub>i</sub>&nbsp;&le;&nbsp;L<sub>j</sub>&nbsp;&le;&nbsp;R<sub>j</sub>&nbsp;&le;&nbsp;R<sub>i</sub></em>가&nbsp;성립한다.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0372705b-c2bd-4d22-9cf8-bec21fe70483/-/preview/" style="height: 337px; width: 700px;" /></p>

<p>이러한&nbsp;요새를&nbsp;파괴하기&nbsp;위해&nbsp;미사일&nbsp;폭격이&nbsp;<em>K</em>번&nbsp;이루어졌다. 각&nbsp;폭격은&nbsp;위치&nbsp;<em>X</em>에&nbsp;위력&nbsp;<em>P</em>인&nbsp;미사일이&nbsp;발사되었고,&nbsp;요새의 <em>X</em> 위치에&nbsp;있는&nbsp;블럭&nbsp;중&nbsp;위에서부터&nbsp;최대&nbsp;<em>P</em>개의&nbsp;블럭을&nbsp;파괴한다. 이때&nbsp;블럭이&nbsp;제거되는&nbsp;과정에서&nbsp;아래에&nbsp;깔려&nbsp;있던&nbsp;블럭이&nbsp;제거되는&nbsp;경우&nbsp;위에&nbsp;있는&nbsp;블럭은&nbsp;피해&nbsp;없이&nbsp;그대로&nbsp;아래로&nbsp;내려온다.</p>

<p>다음&nbsp;그림은&nbsp;위치&nbsp;<em>X</em>=5에&nbsp;위력&nbsp;<em>P</em>=1인&nbsp;미사일이&nbsp;발사되는&nbsp;모습이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/69de5526-77b6-4a19-a7a0-42399452a783/-/preview/" style="width: 1000px; height: 252px;" /><br />
&nbsp;</p>

<p>폭격된&nbsp;순서대로&nbsp;각&nbsp;폭격에&nbsp;대하여&nbsp;파괴된&nbsp;블럭의&nbsp;개수를&nbsp;구하시오.</p>

### 입력

<p>첫&nbsp;줄에&nbsp;블럭의&nbsp;개수&nbsp;<em>N</em>이&nbsp;주어진다. (1&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le;&nbsp;100,000)</p>

<p>다음&nbsp;<em>N</em>줄에&nbsp;걸쳐 요새를 이루고 있는 블럭의&nbsp;정보&nbsp;<em>H</em>,&nbsp;<em>L</em>, <i>R</i>가 주어진다. (1&nbsp;&le;&nbsp;<em>H</em>&nbsp;&le;&nbsp;<em>N,&nbsp;</em>1 &le; <i>L</i>&nbsp;&le; <i>R</i>&nbsp;&le;&nbsp;1,000,000,000)</p>

<p>다음&nbsp;줄에&nbsp;폭격의&nbsp;횟수&nbsp;<em>Q</em>가&nbsp;주어진다. (1&nbsp;&le;&nbsp;<em>Q</em>&nbsp;&le;&nbsp;100,000)</p>

<p>다음&nbsp;<em>Q</em>줄에&nbsp;걸쳐&nbsp;폭격의&nbsp;위치&nbsp;<em>X</em>와&nbsp;위력&nbsp;<em>P</em>가&nbsp;주어진다. (1&nbsp;&le;&nbsp;<em>X</em>&nbsp;&le;&nbsp;1,000,000,000, 1&nbsp;&le;&nbsp;<em>P</em>&nbsp;&le;&nbsp;<em>N</em>)</p>

### 출력

<p>폭격된&nbsp;순서대로&nbsp;각&nbsp;폭격에&nbsp;대하여&nbsp;파괴된&nbsp;블럭의&nbsp;개수를&nbsp;출력한다.</p>