import { createStore } from 'vuex'
import Moduleuser from './user'
import ModulePk from './pk'
import ModuleRecord from './record'

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
    record: ModuleRecord,
  }
})
