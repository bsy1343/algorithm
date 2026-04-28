# [Platinum III] Empresa de Festas - 20280

[문제 링크](https://www.acmicpc.net/problem/20280)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 트리, 세그먼트 트리, 깊이 우선 탐색, 오프라인 쿼리, 희소 배열, 오일러 경로 테크닉

### 문제 설명

<p>Yankovich trabalha como Engenheiro de Software numa empresa, chamada POI, que promove festas online. Para testar os seus sistemas, os empregados organizaram festas e convidaram colegas, mas com algumas restri&ccedil;&otilde;es.</p>

<p>A empresa tem uma estrutura hier&aacute;rquica: Cada empregado, com exce&ccedil;&atilde;o do dono da empresa, tem um gerente direto, e n&atilde;o h&aacute; rela&ccedil;&otilde;es c&iacute;clicas de ger&ecirc;ncia. Devido ao processo de promo&ccedil;&atilde;o da empresa, a idade de um empregado nunca &eacute; maior que a idade do seu gerente direto.</p>

<p>Ser&atilde;o organizadas M festas. A j-&eacute;sima festa tem um anfitri&atilde;o e um intervalo de idades [L<sub>j</sub>, R<sub>j</sub>]. Para a j-&eacute;sima festa ser&aacute; convidado o maior conjunto de pessoas que satisfa&ccedil;a todas as restri&ccedil;&otilde;es abaixo:</p>

<ul>
	<li>O anfitri&atilde;o participa da festa. Por isso, &eacute; garantido que a idade do anfitri&atilde;o da j-&eacute;sima festa est&aacute; no intervalo [L<sub>j</sub>, R<sub>j</sub>].</li>
	<li>Todo convidado precisa ter idade no intervalo [L<sub>j</sub>, R<sub>j</sub>].</li>
	<li>Todo convidado (que n&atilde;o o anfitri&atilde;o) precisa trabalhar diretamente com (ou seja, ser gerente ou subordinado de) algum outro empregado que participa da festa.</li>
	<li>Yankovich est&aacute; respons&aacute;vel pelo programa que fornece informa&ccedil;&otilde;es sobre as festas das quais o usu&aacute;rio participou. Como uma tarefa inicial, ele tem que calcular de quantas festas cada empregado participou. Como ele est&aacute; atrasado para entregar tal tarefa, ele pediu sua ajuda para escrever tal programa.</li>
</ul>

### 입력

<p>A entrada consiste de v&aacute;rias linhas. A primeira linha cont&eacute;m dois inteiros N e M (1 &le; N, M &le; 10<sup>5</sup>) representando o n&uacute;mero de empregados e o n&uacute;mero de festas de teste, respectivamente.</p>

<p>As pr&oacute;ximas N linhas cont&ecirc;m a estrutura hier&aacute;rquica da empresa. A i-&eacute;sima dessas linhas cont&eacute;m dois inteiros A<sub>i</sub> e B<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>5</sup>, 1 &le; B<sub>i</sub> &le; N) representando a idade do i-&eacute;simo empregado e seu gerente direto. Os empregados s&atilde;o numerados de 1 a N, com 1 representando o dono da empresa (ele &eacute; o &uacute;nico empregado com B<sub>i</sub> = i). &Eacute; garantido que&nbsp;A<sub>i</sub> &le; A<sub>B<sub>i</sub></sub> para todo 1 &le; i &le; N.</p>

<p>As pr&oacute;ximas M linhas cont&ecirc;m os dados das festas de teste. A j-&eacute;sima dessas linhas cont&eacute;m tr&ecirc;s inteiros O<sub>j</sub>, L<sub>j</sub>, R<sub>j</sub> (1 &le; L<sub>j</sub> &le; A<sub>O<sub>j</sub></sub> &le; R<sub>j</sub> &le; 10<sup>5</sup>) representando o anfitri&atilde;o da festa e os limites do intervalo de idades descrito no enunciado.</p>

### 출력

<p>Imprima uma &uacute;nica linha contendo N inteiros (separados por um &uacute;nico espa&ccedil;o). O i-&eacute;simo desses n&uacute;meros deve ser o n&uacute;mero de festas de que o empregado i participou.</p>