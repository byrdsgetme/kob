import { createStore } from 'vuex'
import Moduleuser from './user'
import ModulePk from './pk'

export default createStore({
  state: {
  },
  getters: {
  },
  mutations: {
  },
  actions: {
  },
  modules: {
    user: Moduleuser,
    pk: ModulePk,
  }
})
